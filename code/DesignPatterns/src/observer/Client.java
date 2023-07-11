package observer;

public class Client {

    public static void main(String[] args) throws InterruptedException {
        WeatherData weatherData = new WeatherData();

        Observer observer = new Display1();
        Observer observer1 = new Display2();

        weatherData.addObserver(observer);
        weatherData.addObserver(observer1);


        weatherData.measurementsChanged();
        Thread.sleep(1000);
        weatherData.measurementsChanged();
        Thread.sleep(1000);
        weatherData.measurementsChanged();
        Thread.sleep(1000);

    }
}
