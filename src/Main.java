public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        MusicLibrary musicLibrary = new MusicLibrary();
        musicLibrary.makePlaylist("Party Music");
        musicLibrary.makePlaylist("lol");
        musicLibrary.makePlaylist("lol");
        musicLibrary.addTrackToPlaylist("Osmosis---Good Kid","lol");
        musicLibrary.addTrackToPlaylist("Faster---Good Kid","lol");
        musicLibrary.addTrackToPlaylist("Osmosis---Good Kid","lmao");
        musicLibrary.displayTracksInPlaylist("lol");
        musicLibrary.searchPhraseInPlaylists("Osmosis");


    }

}