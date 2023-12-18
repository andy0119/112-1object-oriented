// 測試
public class Main {
    public static void main(String[] args) {
        // 使用 MP3Player
        MusicPlayer mp3Player = new MP3Player();
        mp3Player.play();
        mp3Player.pause();
        mp3Player.stop();

        // 使用 CDPlayer
        MusicPlayer cdPlayer = new CDPlayer();
        cdPlayer.play();
        cdPlayer.pause();
        cdPlayer.stop();
    }
}