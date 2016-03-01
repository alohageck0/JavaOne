package InnerClasses.Challenge;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private Songlist songlist;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songlist = new Songlist();
    }

    public boolean addSong(String title, double duration) {
        if (songlist.findSong(title) == null) {
            songlist.addSong(new Song(title, duration));
            return true;
        }
        return false;
    }

//    private Song findSong(String title) {
//        for (Song checkedSong : this.songs) {
//            if (checkedSong.getTitle().equals(title)) {
//                return checkedSong;
//            }
//        }
//        return null;
//    }

    public boolean addToPlaylist(int trackNumber, LinkedList<Song> playlist) {
        int index = trackNumber - 1;
        ArrayList<Song> songs = songlist.getSongs();
        if ((index > 0) && (index <= songs.size())) {
            playlist.add(songs.get(index));
            return true;
        }
        System.out.println("This album does not hav a track " + trackNumber);
        return false;
    }

    public boolean addToPlaylist(String title, LinkedList<Song> playlist) {
        Song checkSong = songlist.findSong(title);
        if (checkSong != null) {
            playlist.add(checkSong);
            return true;
        }
        System.out.println("This album does not have a track with title " + title);
        return false;
    }

    public class Songlist {
        private ArrayList<Song> songs;

        public Songlist() {
            this.songs = new ArrayList<>();
        }
        private Song findSong(String title) {
            for (Song checkedSong : this.songs) {
                if (checkedSong.getTitle().equals(title)) {
                    return checkedSong;
                }
            }
            return null;
        }

        public boolean addSong(String title, double duration) {
            if (findSong(title) == null) {
                this.songs.add(new Song(title, duration));
                return true;
            }
            return false;
        }
        public boolean addSong(Song song) {
            if (findSong(song.getTitle()) == null) {
                this.songs.add(song);
                return true;
            }
            return false;
        }

        public ArrayList<Song> getSongs() {
            return songs;
        }
    }
}
