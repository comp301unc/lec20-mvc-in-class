package com.comp301.lec20.playlist.controller;

import com.comp301.lec20.playlist.model.Playlist;
import com.comp301.lec20.playlist.model.PlaylistObserver;
import com.comp301.lec20.playlist.model.Song;
import com.comp301.lec20.playlist.model.SongImpl;
import com.comp301.lec20.playlist.view.View;

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

    public void addSong(String title, String artist, int rating) {
        playlist.addSong(new SongImpl(title, artist, rating), playlist.getNumSongs());
    }
}
