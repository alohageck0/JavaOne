import java.util.LinkedList;

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
}
