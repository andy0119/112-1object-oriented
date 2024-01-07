//SmartPhone繼承Device
public class SmartPhone extends Device implements MediaPlayer {

    public void play() {
        System.out.println("SmartPhone is playing.");
    }

    public void stop() {
        System.out.println("SmartPhone is stopped.");
    }

    public String getDeviceName() {
        return "SmartPhone";
    }
}
