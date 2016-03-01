package Interfaces.verPlaylist;

import java.util.*;

public class Main {

   private static List<Album> albums = new ArrayList<>();

   public static void main(String[] args) {
      Album album = new Album("Stormbringer", "Deep Purple");
      album.addSong("Stormbringer", 4.6);
      album.addSong("Stormbringer1", 3.6);
      album.addSong("Stormbringer2", 6.6);
      album.addSong("Stormbringer3", 3.4);
      album.addSong("Stormbringer4", 2.6);
      album.addSong("Stormbringer5", 6.1);
      album.addSong("Stormbringer6", 4.6);
      albums.add(album);

      album = new Album("ACDC album", "AC/DC");
      album.addSong("For those about to rock", 4.5);
      album.addSong("For those about to rock1", 4.5);
      album.addSong("For those about to rock2", 4.5);
      album.addSong("For those about to rock3", 4.5);
      album.addSong("For those about to rock4", 4.5);
      album.addSong("For those about to rock5", 4.5);
      album.addSong("For those about to rock6", 4.5);
      album.addSong("For those about to rock7", 4.5);
      albums.add(album);

      List<Song> playlist = new ArrayList<>();
      albums.get(0).addToPlaylist("Stormbringer", playlist);
      albums.get(0).addToPlaylist("Stormbringer4", playlist);
      albums.get(0).addToPlaylist("Stormbring", playlist); //does not exist


      albums.get(0).addToPlaylist(6, playlist);
      albums.get(0).addToPlaylist(3, playlist);
      albums.get(1).addToPlaylist(2, playlist);
      albums.get(1).addToPlaylist(6, playlist);
      albums.get(1).addToPlaylist(4, playlist);
      albums.get(1).addToPlaylist(111, playlist);//there is no track

      play(playlist);
   }

   private static void play(List<Song> playlist) {
      Scanner scanner = new Scanner(System.in);

      boolean quit = false;
      boolean forward = true;

      ListIterator<Song> listIterator = playlist.listIterator();
      if (playlist.size() == 0) {
         System.out.println("No songs in playlist");
      } else {
         System.out.println("Now playing " + listIterator.next().toString());
         printMenu();

      }

      while (!quit) {
         int action = scanner.nextInt();
         scanner.nextLine();

         switch (action) {
            case 0:
               System.out.println("Playlist complete.");
               quit = true;
               break;
            case 1:
               if (!forward) {
                  if (listIterator.hasNext()) {
                     listIterator.next();
                  }
                  forward = true;
               }
               if (listIterator.hasNext()) {
                  System.out.println("Now playing " + listIterator.next().toString());
               } else {
                  System.out.println("End playlist");
                  forward = false;
               }
               break;
            case 2:
               if (forward) {
                  if (listIterator.hasPrevious()) {
                     listIterator.previous();
                  }
                  forward = false;
               }
               if (listIterator.hasPrevious()) {
                  System.out.println("Now playing " + listIterator.previous().toString());
               } else {
                  System.out.println("End playlist");
                  forward = true;
               }
               break;
            case 3:
               if (forward) {
                  if (listIterator.hasPrevious()) {
                     System.out.println("now Replaying " + listIterator.previous().toString());
                     forward = false;
                  } else {
                     System.out.println("Wea are at the start");
                  }
               } else {
                  if (listIterator.hasNext()) {
                     System.out.println("Now relpaying " + listIterator.next().toString());
                     forward = true;
                  } else {
                     System.out.println("We have reached the end of th list");
                  }
               }
               break;
            case 4:
               printList(playlist);
               break;
            case 5:
               printMenu();
               break;
            case 6:
               if (playlist.size() > 0) {
                  listIterator.remove();
                  if (listIterator.hasNext()) {
                     System.out.println("Now relpaying " + listIterator.next().toString());
                  } else if (listIterator.hasPrevious()) {
                     System.out.println("now Replaying " + listIterator.previous().toString());
                  }
               }
               break;
         }
      }

   }

   private static void printList(List<Song> playlist) {
      Iterator<Song> iterator = playlist.iterator();
      System.out.println("==========");
      while (iterator.hasNext()) {
         System.out.println(iterator.next().toString());
      }
      System.out.println("==========");
   }

   private static void printMenu() {
      System.out.println("Available actions: \npress");
      System.out.println("0 - to quit\n" +
              "1 - play the next song\n" +
              "2 - play previous song\n" +
              "3 - replay current song\n" +
              "4 - list songs in the playlist\n" +
              "5 print available actions\n" +
              "6 - remove current track");
   }

}
