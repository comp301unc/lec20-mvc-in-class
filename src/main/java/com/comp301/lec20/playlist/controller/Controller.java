package com.comp301.lec20.playlist.controller;

import com.comp301.lec20.playlist.model.Song;

public interface Controller {
    int getNumSongs();
    Song getSong(int index);
}
