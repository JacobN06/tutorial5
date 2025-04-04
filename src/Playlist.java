import java.util.ArrayList;

public class Playlist {
    private String playlistName;
    private ArrayList<String> tracksInPlaylist= new ArrayList<>();



    public String getPlaylistName() {
        return playlistName;
    }
    public void setPlaylistName(String playlistName) {
        this.playlistName = playlistName;
    }
    public ArrayList<String> getTracksInPlaylist() {
        return tracksInPlaylist;
    }
    public void setTracks(ArrayList<String> Tracks) {
        this.tracksInPlaylist = Tracks;
    }

    public Playlist(String playlistName) {
        this.playlistName = playlistName;

    }

    public void  addSongToPlaylist(String track) {
        tracksInPlaylist.add(track);
    }

    public void removeSongFromPlaylist(String track) {
        tracksInPlaylist.remove(track);
    }

    public void showPlaylistInfo() {
        System.out.println(playlistName);
        System.out.println(tracksInPlaylist);
    }


}
