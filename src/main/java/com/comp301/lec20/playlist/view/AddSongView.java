package com.comp301.lec20.playlist.view;

import com.comp301.lec20.playlist.controller.Controller;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;

public class AddSongView {
    private Controller controller;

    public AddSongView(Controller controller) {
        this.controller = controller;
    }

    public Parent render() {
        HBox layout = new HBox();

        // Title
        layout.getChildren().add(new Label("Song:"));
        TextField titleInput = new TextField();
        layout.getChildren().add(titleInput);

        // Artist
        layout.getChildren().add(new Label("Artist:"));
        TextField artistInput = new TextField();
        layout.getChildren().add(artistInput);

        // Rating
        layout.getChildren().add(new Label("Rating:"));
        Slider ratingSlider = new Slider(0, 5, 5);
        layout.getChildren().add(ratingSlider);

        // Add button
        Button addButton = new Button("\uff0b");
        layout.getChildren().add(addButton);

        addButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                controller.addSong(titleInput.getText(),
                        artistInput.getText(),
                        (int) ratingSlider.getValue());
            }
        });

        return layout;

    }
}
