package task2.musicLibrary;
import java.util.ArrayList;
import java.util.List;
public class MLMS {
    private List<task2.musicLibrary.Album> library = new ArrayList<>();

    public void addAlbum(task2.musicLibrary.Album album) {
        library.add(album);
    }

    // Methods for adding tracks to albums, removing albums, removing tracks, printing library information, etc.
}