import java.util.ArrayList;

public class MusicLibrary {
    private ArrayList<Playlist> playlistsCollection = new ArrayList<>();

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
        for (Playlist playlist : playlistsCollection) {
            if (playlist.getPlaylistName().equals(playlistName)) {
                found = true;
                playlist.addSongToPlaylist(track);
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
            if (playlist.getTracksInPlaylist().contains(phrase)) {
                found = true;
                System.out.println("Phrase found in playlist");
                System.out.println(playlist.getPlaylistName());
                System.out.println(playlist.getTracksInPlaylist());
                System.out.println();
                return;
            }
        }
        if (!found) {
            System.out.println("Phrase does not exist");
        }
    }


}
