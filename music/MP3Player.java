// MP3Player 類別實現音樂播放器介面
class MP3Player implements MusicPlayer {

    public void play() {
        System.out.println("MP3 播放中");
    }


    public void pause() {
        System.out.println("MP3 暫停");
    }

    public void stop() {
        System.out.println("MP3 停止");
    }
}
