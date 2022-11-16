package com.comp301.lec20.playlist.view;

import com.comp301.lec20.playlist.model.Playlist;
import com.comp301.lec20.playlist.model.PlaylistObserver;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import com.comp301.lec20.playlist.controller.Controller;

public class View implements PlaylistObserver {
    private Controller controller;
    private VBox layout;

    public View(Controller controller) {
        this.controller = controller;
        layout = null;
    }

    public Parent render() {
        layout = new VBox();

        ControlsView controls_view = new ControlsView(controller);
        PlaylistView playlist_view = new PlaylistView(controller);
        AddSongView add_song_view = new AddSongView(controller);

        layout.getChildren().add(controls_view.render());
        layout.getChildren().add(playlist_view.render());
        layout.getChildren().add(add_song_view.render());

        return layout;
    }

    @Override
    public void update(Playlist playlist) {
        if (layout != null) {
            Scene scene = layout.getScene();
            scene.setRoot(render());
            scene.getWindow().sizeToScene();
        }
    }
}
