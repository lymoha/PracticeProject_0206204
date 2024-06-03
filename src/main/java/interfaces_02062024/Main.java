package interfaces_02062024;

public class Main {
    public static void main(String[] args) {
/*
 In the 'main' method, initialize an object of the 'MusicPlayer' and 'VideoPlayer'
 classes with the 'Playable' interface (polymorphism)
 */
        MediaController mediaController = new MediaController();
        Playable musicPlayer = new MusicPlayer();
        Playable videoPlayable =new VideoPlayer();

        mediaController.playMedia(musicPlayer);
        mediaController.playMedia(videoPlayable);
    }
}
