package com.comp301.lec20.playlist.view;

import com.comp301.lec20.playlist.controller.Controller;
import javafx.event.ActionEvent;
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
        pane.getStyleClass().add("controls-layout");

        Button shuffle_button = new Button("Shuffle");

        pane.getChildren().add(shuffle_button);

        shuffle_button.setOnAction((ActionEvent e) -> {
            controller.shuffle();
        });
        return pane;
    }
}
