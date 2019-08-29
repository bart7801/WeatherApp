package com.weather.ui;

import com.weather.service.WeatherService;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import java.util.Map;

class MainViewButton extends Button {

    private static final String BUTTON_TEXT = "CHECK";
    private final WeatherService weatherService;

    MainViewButton(
            TextField cityTextField,
            MainView mainView) {

        this.weatherService = new WeatherService();
        this.setText(BUTTON_TEXT);
        actionForClick(cityTextField, mainView);

    }

    private void actionForClick(TextField cityChooser, MainView mainView) {
        this.setOnAction(event -> {
            String city = cityChooser.getText();
            Map<String, String> summary = weatherService.getSummary(city);
            mainView.getChildren().add(new Text(city));
            summary.entrySet().stream().forEach(x -> {
                String description = x.getKey();
                String value = x.getValue();
                HBox hbox = new HBox();
                hbox.setPadding(new Insets(15, 12, 15, 12));
                hbox.getChildren().addAll(new Text(description), new Text(value));
                mainView.getChildren().add(hbox);
            });
        });
    }
}