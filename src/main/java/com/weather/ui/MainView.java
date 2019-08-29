package com.weather.ui;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

class MainView extends VBox {


    private final TextField cityTextField;
    private final Button runButton;

    MainView() {

        this.cityTextField = new MainViewCityTextField();
        this.runButton = new MainViewButton(
                cityTextField,
                this);

        this.getChildren().addAll(cityTextField, runButton);
    }
}