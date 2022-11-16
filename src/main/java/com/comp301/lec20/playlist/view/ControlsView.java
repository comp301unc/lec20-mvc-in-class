package com.comp301.lec20.playlist.view;

import com.comp301.lec20.playlist.controller.Controller;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;

public class ControlsView {
    private Controller controller;

    public ControlsView(Controller controller) {
        this.controller = controller;
    }

    Parent render() {
        StackPane pane = new StackPane();

        Button shuffle_button = new Button("Shuffle");

        pane.getChildren().add(shuffle_button);

        return pane;
    }
}
