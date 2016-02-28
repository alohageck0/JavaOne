public class Song {
   private String songTitle;
   private String duration;

   public Song(String songTitle, String duration) {
      this.songTitle = songTitle;
      this.duration = duration;
   }

   public String getDuration() {
      return duration;
   }

   public void setDuration(String duration) {
      this.duration = duration;
   }

   public String getSongTitle() {
      return songTitle;
   }

   public void setSongTitle(String songTitle) {
      this.songTitle = songTitle;
   }
}
