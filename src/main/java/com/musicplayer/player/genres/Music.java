package com.musicplayer.player.genres;

import player.playlist.Playlist;

import java.util.List;

public interface Music {
    void getSong(int id);
    void addSongInPlaylist(String artistName, String songName);
    List<Playlist> getPlaylist();
}
