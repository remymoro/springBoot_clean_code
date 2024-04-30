package com.java.playground.solid.isp;



//
public class VlcMediaPlayer implements AudioMediaPlayer, VideoMediaPlayer

{
    @Override
    public void playAudio() {
        System.out.println("Playing audio");
    }

    @Override
    public void playVideo() {
        System.out.println("Playing video");
    }
}
