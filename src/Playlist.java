
import java.util.ArrayList;

public class Playlist {
    private String playlistName;
    private ArrayList<String> tracksInPlaylist= new ArrayList<>();




    public Playlist(String playlistName) {
        this.playlistName = playlistName;
        this.tracksInPlaylist = new ArrayList<>();

    }

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

    //public void  addSongToPlaylist(String track) {
      //  if(musicLibrary.getTracksCollection().contains(track)) {
        //    tracksInPlaylist.add(track);
          //  System.out.println("Song Added to Playlist");
        //}
        //else {
          //  System.out.println("Song Not Added to Playlist, could not be found in MusicLibrary");
        //}


    //}

    public void removeSongFromPlaylist(String track) {
        tracksInPlaylist.remove(track);
    }

    public void showPlaylistInfo() {
        System.out.println(playlistName);
        System.out.println(tracksInPlaylist);
    }


}
