package com.designpattern.observer;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);

        // 更新数据
        weatherData.setMeasurements(0, 0, 0);
        weatherData.setMeasurements(2, 3, 4);
    }
}
