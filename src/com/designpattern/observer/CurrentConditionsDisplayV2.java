package com.designpattern.observer;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplayV2 implements DisplayElement, Observer {
    private float temperature;
    private float humidity;
    private Observable observable;

    public CurrentConditionsDisplayV2(Observable weatherData) {
        this.observable = weatherData;
        this.observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature + "℃ and " + humidity + "% humidity.");
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherDataV2) {
            WeatherDataV2 weatherDataV2 = (WeatherDataV2) o;
            this.temperature = weatherDataV2.getTemperature();
            this.humidity = weatherDataV2.getHumidity();
            display();
        }
    }
}
