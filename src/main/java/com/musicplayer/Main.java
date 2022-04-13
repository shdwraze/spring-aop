package com.musicplayer;

import com.musicplayer.config.AppConfig;
import com.musicplayer.player.MusicPlayer;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.addSongInCurrentPlaylist("Нервы", "Так как надо");
        musicPlayer.play();
        musicPlayer.addSongInCurrentPlaylist("Nirvana", "Rape me");
        musicPlayer.play();
        musicPlayer.addSongInCurrentPlaylist("Король и Шут", "Лесник");
        musicPlayer.getCurrentPlaylist();

        context.close();
    }
}
