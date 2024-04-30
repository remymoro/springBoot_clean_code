package com.java.playground.solid.isp;



// Is this an interface segregation principle violation? If so, why?
// If so, how can you refactor the code to ensure that it does not violate the principle?
// si media player
public class WinampMediaPlayer implements AudioMediaPlayer {
    @Override
    public void playAudio() {
        System.out.println("Playing audio");
    }


}
