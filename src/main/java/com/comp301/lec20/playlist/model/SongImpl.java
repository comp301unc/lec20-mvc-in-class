package com.comp301.lec20.playlist.model;

public class SongImpl implements Song {
    private String artist;
    private String title;
    private int rating;

    public SongImpl(String artist, String title, int rating) {
        this.artist = artist;
        this.title = title;
        this.rating = rating;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getArtist() {
        return artist;
    }

    @Override
    public int getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return title + " by " + artist + " (" + rating + " stars)";
    }
}
