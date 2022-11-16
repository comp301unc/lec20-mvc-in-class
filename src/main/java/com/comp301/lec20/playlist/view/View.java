package com.comp301.lec20.playlist.view;

import javafx.scene.Parent;
import javafx.scene.layout.VBox;
import com.comp301.lec20.playlist.controller.Controller;

public class View {
    private Controller controller;

    public View(Controller controller) {
        this.controller = controller;
    }

    public Parent render() {
        VBox layout = new VBox();

        ControlsView controls_view = new ControlsView(controller);
        PlaylistView playlist_view = new PlaylistView(controller);
        AddSongView add_song_view = new AddSongView(controller);

        layout.getChildren().add(controls_view.render());
        layout.getChildren().add(playlist_view.render());
        layout.getChildren().add(add_song_view.render());

        return layout;
    }
}
