package com.timbuchalka;

import java.io.*;
import java.util.*;

/**
 * Created by timbuchalka on 2/04/2016.
 */
public class Locations implements Map<Integer, Location> {
   private static Map<Integer, Location> locations = new LinkedHashMap<Integer, Location>();
   private static Map<Integer, IndexRecord> index = new LinkedHashMap<>();
   private static RandomAccessFile ra;

   public static void main(String[] args) throws IOException {

      try (RandomAccessFile rao = new RandomAccessFile("locations_rand.dat", "rwd")) {
         rao.writeInt(locations.size());
         int indexSize = locations.size() * 3 * Integer.BYTES;
         int locationsStart = (int) (indexSize + rao.getFilePointer() + Integer.BYTES);
         rao.writeInt(locationsStart);

         long indexStart = rao.getFilePointer();

         int startPoiner = locationsStart;
         rao.seek(startPoiner);

         for (Location location : locations.values()) {
            rao.writeInt(location.getLocationID());
            rao.writeUTF(location.getDescription());
            StringBuilder builder = new StringBuilder();
            for (String direction : location.getExits().keySet()) {
               if (!direction.equalsIgnoreCase("Q")) {
                  builder.append(direction);
                  builder.append(",");
                  builder.append(location.getExits().get(direction));
                  builder.append(",");
               }
            }
            rao.writeUTF(builder.toString());
            IndexRecord record = new IndexRecord(startPoiner, (int) (rao.getFilePointer() - startPoiner));
            index.put(location.getLocationID(), record);
            startPoiner = (int) rao.getFilePointer();
         }

         rao.seek(indexStart);
         for (Integer locationID : index.keySet()) {
            rao.writeInt(locationID);
            rao.writeInt(index.get(locationID).getStartByte());
            rao.writeInt(index.get(locationID).getLength());
         }
      }

   }

   //   1. This first 4 butes will contain the number of locations (bytes 0-3)
//   2. The next 4 bytes will contain the start offset of the locations sections (4-7)
//   3. The next section of the file will contain th index (1692 bytes long) (8-1699)
//   4. The final section of the file will contain the location records (the data - will start from 1700)
   static {

      try {
         ra = new RandomAccessFile("locations_rand.dat", "rwd");
         int numLocations = ra.readInt();
         long locationStrtPoint = ra.readInt();

         while (ra.getFilePointer() < locationStrtPoint) {
            int locationID = ra.readInt();
            int locationStart = ra.readInt();
            int locationLength = ra.readInt();

            IndexRecord record = new IndexRecord(locationStart, locationLength);
            index.put(locationID, record);
         }
      } catch (IOException e) {
         System.out.println("IOExceptio in static initialier " + e.getMessage());
      }
//      try (ObjectInputStream locFile = new ObjectInputStream(new BufferedInputStream(new FileInputStream("locations.dat")))) {
//         boolean eof = false;
//         while (!eof) {
//            try {
//               Location location = (Location) locFile.readObject();
//               System.out.println("Read location " + location.getLocationID() + " : " + location.getDescription());
//               System.out.println("Found " + location.getExits().size() + " exits");
//
//               locations.put(location.getLocationID(), location);
//            } catch (EOFException e) {
//               eof = true;
//            }
//         }
//      } catch (InvalidClassException e) {
//         System.out.println("Invalid class exception " + e.getMessage());
//      } catch (IOException io) {
//         System.out.println("IO Exception" + io.getMessage());
//      } catch (ClassNotFoundException e) {
//         System.out.println("ClassNotFoundException " + e.getMessage());
//      }
   }

   public Location getLocation(int locationID) throws IOException {
      IndexRecord record = index.get(locationID);
      ra.seek(record.getStartByte());
      int id = ra.readInt();
      String description = ra.readUTF();
      String exits = ra.readUTF();
      String[] exitPart = exits.split(",");
      Location location = new Location(locationID, description, null);

      if (locationID != 0) {
         for (int i = 0; i < exitPart.length; i++) {
            System.out.println("exitPart = " + exitPart[i]);
            System.out.println("exitPart[+1] " + exitPart[i + 1]);
            String direction = exitPart[i];
            int destination = Integer.parseInt(exitPart[++i]);
            location.addExit(direction, destination);
         }
      }
      return location;
   }

   @Override
   public int size() {
      return locations.size();
   }

   @Override
   public boolean isEmpty() {
      return locations.isEmpty();
   }

   @Override
   public boolean containsKey(Object key) {
      return locations.containsKey(key);
   }

   @Override
   public boolean containsValue(Object value) {
      return locations.containsValue(value);
   }

   @Override
   public Location get(Object key) {
      return locations.get(key);
   }

   @Override
   public Location put(Integer key, Location value) {
      return locations.put(key, value);
   }

   @Override
   public Location remove(Object key) {
      return locations.remove(key);
   }

   @Override
   public void putAll(Map<? extends Integer, ? extends Location> m) {

   }

   @Override
   public void clear() {
      locations.clear();

   }

   @Override
   public Set<Integer> keySet() {
      return locations.keySet();
   }

   @Override
   public Collection<Location> values() {
      return locations.values();
   }

   @Override
   public Set<Entry<Integer, Location>> entrySet() {
      return locations.entrySet();
   }

   public void close() throws IOException {
      ra.close();
   }
}
