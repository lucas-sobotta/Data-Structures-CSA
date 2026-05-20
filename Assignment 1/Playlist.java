public class Playlist {
    private int size;
    private SongNode head;

    public Playlist(){
        this.size = 0;
        this.head = null;
    }

    public void addToFront(SongNode s){
        s.next = head;
        head = s;
        size++;
    }
    public void addToEnd(SongNode s){
        SongNode current = head;
        while (current!= null){
            if (current.next == null){
                current.next = s;
                s.next = null;
                size++;
                break;
            }
            current = current.next;
        }
    }
    public SongNode removeFirst(){
        SongNode temp = head;
        head = head.next;
        size--;
        return temp;
    }
    public void playAll(){
        SongNode current = head;
        while (current!=null){
            System.out.print(current.data.toString());
            if(current.next != null){
                System.out.print("/n");
            }
            current = current.next;
        }
        System.out.println("END");
    }
    public int size(){
        return size;
    }
}
