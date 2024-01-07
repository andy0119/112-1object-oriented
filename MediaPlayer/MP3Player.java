//MP3Player繼承Device
public class MP3Player extends Device implements MediaPlayer {

    public void play() {
        System.out.println("MP3Player is playing.");
    }

    public void stop() {
        System.out.println("MP3Player is stopped.");
    }

    public String getDeviceName() {
        return "MP3Player";
    }
}