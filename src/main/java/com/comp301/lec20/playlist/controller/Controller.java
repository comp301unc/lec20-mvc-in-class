package com.comp301.lec20.playlist.controller;

import com.comp301.lec20.playlist.model.Song;

public interface Controller {
    int getNumSongs();
    Song getSong(int index);
    void addSong(String title, String artist, int rating);
    void deleteSong(int index);
    void moveSongUp(int index);
    void moveSongDown(int index);
    void shuffle();
}
