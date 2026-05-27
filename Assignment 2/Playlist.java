import java.util.LinkedList;

public class Playlist {
    private LinkedList<Song> songs = new LinkedList<>();

    public void addToFront(Song song) {
        songs.addFirst(song);
    }
    public void addToEnd(Song song) {
        songs.addLast(song);
    }
    public Song removeFront() {
        if (songs.isEmpty()) {
            return null;
        }
        return songs.removeFirst();
    }
    public Song nowPlaying(){
        if (songs.peekFirst() == null) {
            return null;
        }
        return songs.peekFirst();
    }
    public void printPlaylist() {
        for (Song song : songs) {
            System.out.println(song);
        }
    }
}
