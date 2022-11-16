package com.comp301.lec20.playlist.view;

import javafx.scene.Parent;
import javafx.scene.layout.VBox;
import com.comp301.lec20.playlist.controller.Controller;

public class PlaylistView {
    private Controller controller;

    public PlaylistView(Controller controller) {
        this.controller = controller;
    }

    public Parent render() {
        VBox pane = new VBox();

        int num_songs = controller.getNumSongs();

        for (int i=0; i<num_songs; i++) {
            SongView song_view = new SongView(controller, i);
            pane.getChildren().add(song_view.render());
        }

        return pane;
    }
}
