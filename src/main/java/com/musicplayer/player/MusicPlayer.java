package com.musicplayer.player;

import com.musicplayer.player.genres.Music;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import player.playlist.Playlist;

import java.util.List;

@Component
public class MusicPlayer {
    private int NEXT_TRACK = 0;
    private Music music;

    @Autowired
    public MusicPlayer(Music music) {
        this.music = music;
    }

    public void play() {
        music.getSong(NEXT_TRACK++);
    }

    public void addSongInCurrentPlaylist(String artistName, String songName) {
        music.addSongInPlaylist(artistName, songName);
    }

    public void getCurrentPlaylist() {
        List<Playlist> playlist = music.getPlaylist();

        System.out.println("Playlist at Rock Music:");
        for (Playlist song : playlist) {
            System.out.println(song.getArtistName() + " - " + song.getSongName());
        }
    }
}
