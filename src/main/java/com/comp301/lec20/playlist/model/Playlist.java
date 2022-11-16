package com.comp301.lec20.playlist.model;

public interface Playlist {
    int getNumSongs();
    Song getSong(int index);
    void removeSong(int index);
    void addSong(Song song, int index);
    void addObserver(PlaylistObserver observer);
}
