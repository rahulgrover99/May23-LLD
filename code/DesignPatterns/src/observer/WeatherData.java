package observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject{

    private int temperature;
    private int humidity;
    private int pressure;

    private List<Observer> observerList = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer: observerList) {
            observer.update(temperature, pressure, humidity);
        }
    }

    void measurementsChanged() {
        temperature = (int)(Math.random()*100);
        humidity = (int)(Math.random()*100);
        pressure = (int)(Math.random()*100);
        notifyObservers();
    }
}
