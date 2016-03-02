package InnerClasses.Challenge.TimsVersion;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
   private String name;
   private String artist;
   private SongList songs;

   public Album(String name, String artist) {
      this.name = name;
      this.artist = artist;
      this.songs = new SongList();
   }

   public boolean addSong(String title, double duration) {
      return this.songs.add(new Song(title, duration));
   }


   public boolean addToPlaylist(int trackNumber, LinkedList<Song> playlist) {
      Song checkedSong = this.songs.findSong(trackNumber);
      if (checkedSong != null) {
         playlist.add(checkedSong);
         return true;
      }
      System.out.println("This album does not hav a track " + trackNumber);
      return false;
   }

   public boolean addToPlaylist(String title, LinkedList<Song> playlist) {
      Song checkSong = this.songs.findSong(title);
      if (checkSong != null) {
         playlist.add(checkSong);
         return true;
      }
      System.out.println("This album does not have a track with title " + title);
      return false;
   }

   private class SongList {
      private ArrayList<Song> songs;

      public SongList() {
         this.songs = new ArrayList<>();
      }

      public boolean add(Song song) {
         if (songs.contains(song)) {
            return false;
         }
         this.songs.add(song);
         return true;
      }

      private Song findSong(String title) {
         for (Song checkedSong : this.songs) {
            if (checkedSong.getTitle().equals(title)) {
               return checkedSong;
            }
         }
         return null;
      }

      public Song findSong(int trackNUmber) {
         int index = trackNUmber - 1;
         if ((index > 0) && (index <= songs.size())) {
            return songs.get(index);
         }
         return null;
      }
   }
}
