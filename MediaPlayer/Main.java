public class Main {
    public static void main(String[] args) {
        MP3Player mp3Player = new MP3Player();
        SmartPhone smartPhone = new SmartPhone();

        mp3Player.play();
        mp3Player.stop();

        smartPhone.play();
        smartPhone.stop();

        System.out.println("MP3Player device name: " + mp3Player.getDeviceName());
        System.out.println("SmartPhone device name: " + smartPhone.getDeviceName());
    }
}
