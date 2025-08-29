package C4_design_patterns.structural.Adapter;

// VlcPlayer.java
public class VlcPlayer implements AdvancedMediaPlayer {
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file: " + fileName);
    }
    public void playMp4(String fileName) {
        // do nothing
    }
}
