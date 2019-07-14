package com.ui;

import javafx.collections.FXCollections;
import javafx.scene.control.ComboBox;


class MainViewComboBox extends ComboBox<String> {

    MainViewComboBox(WeatherService currencyService) {
        super(FXCollections.observableArrayList(currencyService.getWeathersList()));
    }
}