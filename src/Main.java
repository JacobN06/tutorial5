public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        MusicLibrary musicLibrary = new MusicLibrary();
       // Playlist playlist1 = new Playlist(musicLibrary);
        System.out.println("Test1: making play lists");

        musicLibrary.makePlaylist("Party Music");
        musicLibrary.makePlaylist("lol");
        musicLibrary.makePlaylist("lol");
        System.out.println();
        System.out.println("Test2: adding music to tracks collection");

        musicLibrary.addTrackToTracksCollection("Osmosis---Good Kid");
        musicLibrary.addTrackToTracksCollection("Faster---Good Kid");
        musicLibrary.addTrackToTracksCollection("Faster---Good Kid");
        //good
        System.out.println();
        System.out.println("Test3: adding music to playlists");
//good
        musicLibrary.addTrackToPlaylist("Faster---Good Kid","lol");
        musicLibrary.addTrackToPlaylist("Osmosis---Good Kid","lol");
        //good
        System.out.println();
        System.out.println("Test4: adding music to playlist that dosnt exist");

        musicLibrary.addTrackToPlaylist("Osmosis---Good Kid","lmao");

        System.out.println("Test4.5: adding music that dosnt exist to playlist");
        musicLibrary.addTrackToPlaylist("Osmosisism---Good adult","lol");
        //good
        System.out.println("Test5: showing music in a playlist");

        musicLibrary.displayTracksInPlaylist("lol");

        System.out.println("Test6: loooking for word in a play list");
        musicLibrary.searchPhraseInPlaylists("Osmosis");
        System.out.println();
        System.out.println("Test6.5: looking for word that is not in a playlist");
        musicLibrary.searchPhraseInPlaylists("People");
        System.out.println();

        System.out.println("Test7: displaying all playlists and all tracks");
        musicLibrary.displayAllPlaylists();
        musicLibrary.showTracksCollection();


    }

}