package com.comp301.lec20.playlist.model;

import java.util.ArrayList;
import java.util.List;

public class PlaylistImpl implements Playlist {
    private List<Song> playlist;
    private List<PlaylistObserver> observers;

    public PlaylistImpl() {
        playlist = new ArrayList<>();
        observers = new ArrayList<>();
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
        notifyObservers();
    }

    @Override
    public void addSong(Song song, int index) {
        playlist.add(index, song);
        notifyObservers();
//        System.out.println(this);
    }

    @Override
    public String toString() {
        String result = "";
        for (int i=0; i<playlist.size(); i++) {
            result += i + ": " + playlist.get(i) + "\n";
        }
        return result;
    }

    @Override
    public void addObserver(PlaylistObserver observer) {
        observers.add(observer);
    }

    private void notifyObservers() {
        for (PlaylistObserver o : observers) {
            o.update(this);
        }
    }
}
