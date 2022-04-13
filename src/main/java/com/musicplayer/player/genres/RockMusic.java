package com.musicplayer.player.genres;

import org.springframework.stereotype.Component;
import player.playlist.Playlist;

import java.util.ArrayList;
import java.util.List;

@Component
public class RockMusic implements Music {
    private List<Playlist> playlist = new ArrayList<>();

    @Override
    public void getSong(int id) {
        Playlist song = playlist.get(id);
        System.out.println("Playing: " + song.getArtistName() + " " + song.getSongName());
    }

    @Override
    public void addSongInPlaylist(String artistName, String songName) {
        playlist.add(new Playlist(artistName, songName));
        System.out.println("Song added to playlist\n");
    }

    @Override
    public List<Playlist> getPlaylist() {
        return playlist;
    }
}
