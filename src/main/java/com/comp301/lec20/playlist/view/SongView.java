package com.comp301.lec20.playlist.view;

import com.comp301.lec20.playlist.controller.Controller;
import com.comp301.lec20.playlist.model.Song;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;

public class SongView {
    private Controller controller;
    private int index;

    public SongView(Controller controller, int index) {
        this.controller = controller;
        this.index = index;
    }

    public Parent render() {
        HBox layout = new HBox();
        layout.getStyleClass().add("song-layout");

        // Delete button
        Button deleteButton = new Button("\u274C");
        layout.getChildren().add(deleteButton);
        deleteButton.setOnAction((ActionEvent actionEvent) -> {
            controller.deleteSong(index);
        });

        // Up button
        Button upButton = new Button("\u25B2");
        layout.getChildren().add(upButton);
        upButton.setOnAction((ActionEvent e) -> {
            controller.moveSongUp(index);
        });

        // Down button
        Button downButton = new Button("\u25BC");
        layout.getChildren().add(downButton);
        downButton.setOnAction((ActionEvent e) -> {
            controller.moveSongDown(index);
        });

        // Title
        Label title = new Label(makeLabelString());
        layout.getChildren().add(title);

        return layout;
    }

    private String makeLabelString() {
        Song song = controller.getSong(index);
        return song.getTitle() + " by " + song.getArtist() + " (" +
                makeRating(song.getRating()) + ")";
    }

    private String makeRating(int ratingInt) {
        String ratingString = "";
        for (int i = 0; i < ratingInt; i++) {
            ratingString += "\u2605";
        }
        for (int i = ratingInt; i < 5; i++) {
            ratingString += "\u2606";
        }
        return ratingString;
    }

}
