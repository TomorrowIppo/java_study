package C4_design_patterns.structural.Adapter;

// AdapterDemo.java
public class AdapterDemo {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "banger.mp3");
        audioPlayer.play("mp4", "movie.mp4");
        audioPlayer.play("vlc", "concert.vlc");
        audioPlayer.play("avi", "random.avi");
    }
}

