import java.util.LinkedList;
import java.util.ListIterator;

public class Playlist {
   private String playlistName;
   private LinkedList<Song> songsPlaylist;

   public Playlist(String playlistName) {
      this.playlistName = playlistName;
      this.songsPlaylist = new LinkedList<>();
   }

   public LinkedList<Song> getSongsPlaylist() {
      return songsPlaylist;
   }

   public String getPlaylistName() {
      return playlistName;
   }

   public boolean addSongFromAlbum(Album album, String songTitle) {
      Song song = album.querySong(songTitle);
      if (song != null) {
         songsPlaylist.add(song);
         return true;
      }
      return false;
   }

   public void printPlaylist() {
      System.out.println("Playlist: ");
      for (int i = 0; i < songsPlaylist.size(); i++) {
         Song song = songsPlaylist.get(i);
         System.out.println((i + 1) + ". " + song.songInfo());
      }
   }

   public boolean playPlaylist() {
      boolean quit = true;
      ListIterator<Song> listIterator = this.songsPlaylist.listIterator();
      if (songsPlaylist.isEmpty()) {
         System.out.println("No songs added");
      } else {
         System.out.println("Now playing " + listIterator.next().songInfo());
         printMenu();
      }
//      while (quit) {
//
//      }
      return true;
   }

   private static void printMenu() {
      System.out.println("Available actions: \npress");
      System.out.println("0 - to quit\n" +
              "1 - skip to the next song\n" +
              "2 - skip to previous song\n" +
              "3 - replay current song");
   }
}
