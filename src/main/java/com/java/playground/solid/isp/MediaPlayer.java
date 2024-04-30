package com.java.playground.solid.isp;


// nous somme sous le principe de isp (interface segregation principle)
// nous avons une interface qui contient deux méthodes playAudio et playVideo
// nous avons deux classes qui implémentent cette interface
// nous allons créer une interface pour chaque méthode


// VideoMediaPlayer et AudioMediaPlayer
public interface MediaPlayer {

    public void playAudio();
    public void playVideo();
}
