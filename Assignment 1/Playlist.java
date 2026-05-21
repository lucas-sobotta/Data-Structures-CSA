public class Playlist {
    private int size;
    private SongNode head;

    public Playlist(){
        this.size = 0;
        this.head = null;
    }

    public void addToFront(Song s){
        SongNode newSong = new SongNode(s);
        newSong.next = head;
        head = newSong;
        size++;
    }

    public void Print(){
        System.out.print("[");
        SongNode current = head;
        while (current != null) {
            System.out.print(current.song.title);
            if (current.next != null) {
                System.out.print(", ");
            }
            current = current.next;
        }
        System.out.println("]");
    }

    public void addToEnd(Song s){
        SongNode newSong = new SongNode(s);
        if (head == null) {
            head = newSong;
        } else {
            SongNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newSong;
        }
        size++;
    }
    
    public Song removeFirst(){
        if (head == null){
            System.out.println("Playlist is empty");
            return null;
        }
        Song removedSong = head.song;
        head = head.next;
        size--;
        return removedSong;
    }
    
    public int getSize(){
        return size;
    }

}
