
import java.util.ArrayList;

public class MusicLibrary {
    private ArrayList<Playlist> playlistsCollection = new ArrayList<>();
    public ArrayList<Playlist> getPlaylistsCollection() {
        return playlistsCollection;
    }
    private ArrayList<String> tracksCollection = new ArrayList<>();
    public ArrayList<String> getTracksCollection() {
        return tracksCollection;
    }
    public void addTrackToTracksCollection(String track) {
        if(tracksCollection.contains(track)) {
            System.out.println("Track " + track + " already exists");
        }
        else {
            tracksCollection.add(track);
            System.out.println("Added track: " + track);
        }
    }
    public void showTracksCollection() {
        System.out.println("All Songs Available:");
        getTracksCollection().forEach(track -> System.out.println(track));
    }

    public void makePlaylist(String title) {
        boolean exists = false;
        for (Playlist playlist : playlistsCollection) {
            if(title == playlist.getPlaylistName()){
                exists = true;
                System.out.println("Playlist already exists");
                System.out.println();
                break;
            }
        }
        if(!exists){playlistsCollection.add(new Playlist(title));
            System.out.println("Playlist added to collection");
            for (Playlist playlist : playlistsCollection) {
                System.out.println(playlist.getPlaylistName());
            }
        }

    }

    public void addTrackToPlaylist(String track, String playlistName) {
        boolean found = false;
        if( tracksCollection.contains(track)) {
            for (Playlist playlist : playlistsCollection) {
                if (playlist.getPlaylistName().equals(playlistName)) {
                    found = true;
                    playlist.getTracksInPlaylist().add(track);
                    System.out.println("song added to playlist");
                    System.out.println();
                    return;
                }

            }
            if (!found) {
                System.out.println("Playlist does not exist");
                System.out.println();
            }

        }
        else {
            System.out.println("Song Not Added to Playlist, could not be found in MusicLibrary");
        }

    }

    public void removeTrackFromPlaylist(String track, String playlistName) {
        boolean found = false;
        for (Playlist playlist : playlistsCollection) {
            if (playlist.getPlaylistName().equals(playlistName)) {
                found = true;
                playlist.removeSongFromPlaylist(track);
                System.out.println("song removed from playlist");
                System.out.println();
                return;
            }
        }
        if (!found) {
            System.out.println("Playlist does not exist");
            System.out.println();
        }
    }
    public void displayTracksInPlaylist(String playlistName) {
        boolean found = false;

        for (Playlist playlist : playlistsCollection) {
            if (playlist.getPlaylistName().equals(playlistName)) {
                found = true;
                System.out.println(playlist.getPlaylistName());
                System.out.println(playlist.getTracksInPlaylist());
                System.out.println();
                return;
            }
        }
        if (!found) {
            System.out.println("Playlist does not exist");
            System.out.println();
        }

    }
    public void searchPhraseInPlaylists(String phrase) {
        boolean found = false;
        for (Playlist playlist : playlistsCollection) {
            for(String Track : playlist.getTracksInPlaylist()){
                if(Track.toLowerCase().contains(phrase.toLowerCase())){
                    found = true;
                    System.out.println("Phrase found in playlist");
                    System.out.println(playlist.getPlaylistName());
                    System.out.println(playlist.getTracksInPlaylist());
                    System.out.println();
                    return;
                }
            }
        }
        if (!found) {
            System.out.println("Phrase does not exist");
            System.out.println();
        }
    }

    public void displayAllPlaylists() {
        System.out.println("All playlists:");
        getPlaylistsCollection().forEach(playlist -> System.out.println(playlist.getPlaylistName()));
        System.out.println();
    }


}
