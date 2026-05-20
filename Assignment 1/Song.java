public class Song {
    String title;
    String artist;
    String album;

    public Song(String album, String artist, String title){
        this.title = title;
        this.artist = artist;
        this.album = album;
    }

    public string toString(){
        String toReturn = "Title: "+title;
        toReturn+= "/nArtist: "+artist;
        toReturn+="/nAlbum: "+album;
        return toReturn
    }
}
