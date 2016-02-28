import java.util.ArrayList;

public class Album {
   private String albumName;
   private ArrayList<Song> songList;

   public Album(String albumName) {
      this.albumName = albumName;
      this.songList = new ArrayList<>();
   }

   public String getAlbumName() {
      return albumName;
   }

   public ArrayList<Song> getSongList() {
      return songList;
   }

   public boolean addSong(String songTitle, String songDuration) {
      if (!findSong(songTitle)) {
         this.songList.add(new Song(songTitle, songDuration));
         System.out.println(songTitle + " was added to album ->" + this.albumName);
         return true;
      }
      System.out.println("Song " + songTitle + " already in the playlist");
      return false;
   }

   private boolean findSong(String songTitle) {
      for (int i = 0; i < songList.size(); i++) {
         if (songList.get(i).getSongTitle().equals(songTitle)) {
            return true;
         }
      }
      return false;
   }

   public Song querySong(String songTitle) {
      for (int i = 0; i < songList.size(); i++) {
         Song song = songList.get(i);
         if (song.getSongTitle().equals(songTitle)) {
            return song;
         }
      }
      return null;
   }
}

