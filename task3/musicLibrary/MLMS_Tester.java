package task3.musicLibrary;
public class MLMS_Tester {
    public static void main(String[] args) {
        task2.musicLibrary.Album album1 = new task2.musicLibrary.Album();
        album1.setTitle("Thriller");
        album1.setArtist("Michael Jackson");
        album1.setReleaseYear(1982);
        // Add tracks to album1

        task2.musicLibrary.Album album2 = new task2.musicLibrary.Album();
        album2.setTitle("Dark Side of the Moon");
        album2.setArtist("Pink Floyd");
        album2.setReleaseYear(1973);
        // Add tracks to album2

        task2.musicLibrary.MLMS mlms = new task2.musicLibrary.MLMS();
        mlms.addAlbum(album1);
        mlms.addAlbum(album2);
        // Test other MLMS functionalities
    }
}
