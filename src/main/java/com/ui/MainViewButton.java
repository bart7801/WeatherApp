package com.ui;

import com.example.Weather;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.text.Text;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

class MainViewButton extends Button {

    MainViewButton(
            ComboBox<String> cityChooser,
            WeatherService weatherService,
            Text text) {

        this.setText(BUTTON_TEXT);
        actionForClick(cityChooser, weatherService, text);

    }

    private void actionForClick(ComboBox<String> CityChooser, WeatherService weatherService, Text text) {
        this.setOnAction(event -> {
            String cityChooser = cityChooser.getSelectionModel().getSelectedItem();



            //String buyCourse = weatherService.getBuyCourseForCurrencyAndDate(currencyValue, formattedDate);
            //text.setText(buyCourse);
        });
    }
}