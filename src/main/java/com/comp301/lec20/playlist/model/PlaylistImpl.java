package com.comp301.lec20.playlist.model;

import java.util.ArrayList;
import java.util.List;

public class PlaylistImpl implements Playlist {
    private List<Song> playlist;

    public PlaylistImpl() {
        playlist = new ArrayList<>();
    }

    @Override
    public int getNumSongs() {
        return playlist.size();
    }

    @Override
    public Song getSong(int index) {
        return playlist.get(index);
    }

    @Override
    public void removeSong(int index) {
        playlist.remove(index);
    }

    @Override
    public void addSong(Song song, int index) {
        playlist.add(index, song);
    }
}
