package com.musicplayer.aspects;

import org.aspectj.lang.annotation.Pointcut;

public class Pointcuts {
    @Pointcut("execution(public void com.musicplayer.player.MusicPlayer.play())")
    public void playMusicPointcut() {}

    @Pointcut("execution(public void com.musicplayer.player.genres.Music.addSongInPlaylist(..))")
    public void addMusicInPlaylist() {}

    @Pointcut("execution(public void com.musicplayer.player.MusicPlayer.getCurrentPlaylist())")
    public void getPlaylist() {}
}
