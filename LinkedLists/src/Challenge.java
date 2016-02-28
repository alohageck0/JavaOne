public class Challenge {
   public static void main(String[] args) {
      Album album = new Album("Test");
      album.addSong("Track1", "01:14");
      album.addSong("Track2", "02:14");
      album.addSong("Track3", "03:14");
      album.addSong("Track4", "04:14");
      album.addSong("Track5", "05:14");

      Playlist playlist = new Playlist("Test1");
      playlist.addSongFromAlbum(album, "Track3");
      playlist.addSongFromAlbum(album, "Track5");
      playlist.addSongFromAlbum(album, "Track1");

      playlist.printPlaylist();
      playlist.playPlaylist();
   }

}
