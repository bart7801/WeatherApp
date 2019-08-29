package com.ui;

import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Application extends javafx.application.Application {

    public void start(Stage primaryStage) {
        VBox root = new MainView();
        primaryStage.setTitle("WEATHER  enter city nama, country ID");
        primaryStage.setScene(new Scene(root, 500, 600));
        primaryStage.show();
    }
}