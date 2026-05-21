public class Main {
    public static void main(String[] args) {
        Playlist myPL = new Playlist();
        Song song1 = new Song("Short n' Sweet", "Sabrina Carpenter", "Espresso");
        myPL.addToFront(song1);
        Song song2 = new Song("Billie Jean", "Michael Jackson", "Thriller");
        myPL.addToFront(song2);
        myPL.Print();
        Song song3 = new Song("Rumours", "Fleetwood Mac", "Dreams");
        myPL.addToEnd(song3);
        myPL.Print();
        Song song4 = new Song("The Romantic", "Bruno Mars", "I Just Might");
        myPL.addToFront(song4);
        myPL.Print();
        System.out.println(myPL.removeFirst());
        myPL.Print();
    }
}