package com.comp301.lec20.playlist.controller;

import com.comp301.lec20.playlist.model.Playlist;
import com.comp301.lec20.playlist.model.Song;

public class ControllerImpl implements Controller {
    private Playlist playlist;

    public ControllerImpl(Playlist playlist) {
        this.playlist = playlist;
    }


    @Override
    public int getNumSongs() {
        return playlist.getNumSongs();
    }

    @Override
    public Song getSong(int index) {
        return playlist.getSong(index);
    }
}
