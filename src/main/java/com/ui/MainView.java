package com.ui;

import com.example.Weather;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

class MainView extends VBox {

    private final WeatherService weatherService;

    private final ComboBox<String> weatherComboBox;
    private final TextField textField;
    private final Button runButton;
    private final Text resultText;

    MainView() {
        this.weatherService = new WeatherService();

        this.weatherComboBox = new MainViewComboBox(weatherService);
        this.textField = new TextField();
        this.resultText = new Text();
        this.runButton = new MainViewButton(weatherComboBox, textField, resultText);

        this.getChildren().addAll(weatherComboBox, textField, runButton, resultText);
    }
}