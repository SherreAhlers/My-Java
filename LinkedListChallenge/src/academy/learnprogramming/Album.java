package academy.learnprogramming;

import java.util.ArrayList;
import java.util.LinkedList;


public class Album {
    private String name;
    private String artist;
//    private ArrayList<Song> songs;
    // I got rid of this because it is not hosted by other class.
    private SongList songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new SongList();
    }

    public boolean addSong(String title, double duration) {
        return this.songs.add(new Song(title, duration));
        // all of the code below was removed because I summed it up on one
        // line above.
//        if (findSong(title) == null) {
//            this.songs.add(new Song(title, duration));
//            return true;
//        }
//        return false;
    }
//     public boolean addToPlayList(int trackNumber, List<Song> playList) {
    // to use Interface with this write the below like above:
    public boolean addToPlayList(int trackNumber, LinkedList<Song> playList) {
//        int index = trackNumber -1;
//        if((index >= 0) && (index <= this.songs.size())) {
//            playList.add(this.songs.get(index));
//            return true;
//        }
        // the above was deleted due to refactoring.
        Song checkedSong = this.songs.findSong(trackNumber);
        if(checkedSong != null) {
            playList.add(checkedSong);
            return true;
        }
        System.out.println("This album does not have a track " + trackNumber);
        return false;
    }
//    public boolean addToPlayList(String title, List<Song> playList) {
        // to use Interface write below code like above:
    public boolean addToPlayList(String title, LinkedList<Song> playList) {
//        Song checkedSong = findSong(title);
        Song checkedSong = songs.findSong(title);
        if(checkedSong != null) {
            playList.add(checkedSong);
            return true;
        }
        System.out.println("The song " + title + " is not in this album.");
        return false;
    }
    private class SongList {
        private ArrayList<Song> songs;

        public SongList() {
            this.songs = new ArrayList<Song>();
        }
        public boolean add(Song song) {
            if(songs.contains(song)) {
                return false;
            }
            this.songs.add(song);
            return true;
        }
        private Song findSong(String title) {
            for(Song checkedSong: this.songs) {
                if(checkedSong.getTitle().equals(title)) {
                    return checkedSong;
                }
            }
            return null;
        }
      private Song findSong(int trackNumber) {
            int index = trackNumber -1;
            if((index >= 0) && (index < songs.size())) {
                return songs.get(index);
            }
            return null;
      }
    }
}
