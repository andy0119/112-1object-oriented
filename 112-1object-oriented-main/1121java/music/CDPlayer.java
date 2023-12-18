// CDPlayer 類別實現音樂播放器介面
class CDPlayer implements MusicPlayer {
    @Override
    public void play() {
        System.out.println("CD 播放中");
    }

    @Override
    public void pause() {
        System.out.println("CD 暫停");
    }

    @Override
    public void stop() {
        System.out.println("CD 停止");
    }
}
