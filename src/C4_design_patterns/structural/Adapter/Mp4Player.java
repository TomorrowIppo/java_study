package C4_design_patterns.structural.Adapter;

// Mp4Player.java
public class Mp4Player implements AdvancedMediaPlayer {
    public void playVlc(String fileName) {
        // do nothing
    }
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file: " + fileName);
    }
}
