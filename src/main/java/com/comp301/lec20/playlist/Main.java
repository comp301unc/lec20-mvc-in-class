package com.comp301.lec20.playlist;


import com.comp301.lec20.playlist.controller.Controller;
import com.comp301.lec20.playlist.controller.ControllerImpl;
import com.comp301.lec20.playlist.model.Playlist;
import com.comp301.lec20.playlist.model.PlaylistImpl;
import com.comp301.lec20.playlist.model.Song;
import com.comp301.lec20.playlist.view.View;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
  public static void main(String[] args) {
    launch();
  }

  @Override
  public void start(Stage stage)  {

    stage.setTitle("Playlist Viewer");

    Playlist playlist = new PlaylistImpl();
    Controller controller = new ControllerImpl(playlist);
    View view = new View(controller);
    playlist.addObserver(view);

    Scene scene = new Scene(view.render());
    stage.setScene(scene);
    stage.show();
  }
}
