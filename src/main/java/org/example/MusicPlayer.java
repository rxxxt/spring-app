package org.example;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
    @Autowired
    @Qualifier("rockMusic")
    private Music music1;
    @Autowired
    @Qualifier("classicalMusic")
    private Music music2;

    public void playMusic() {
        System.out.println("Playing: " + music1.getSong());
        System.out.println("Playing: " + music2.getSong());
    }
}
