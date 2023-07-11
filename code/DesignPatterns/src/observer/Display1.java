package observer;

public class Display1 implements Observer{

    private int temperature;
    private int humidity;
    private int pressure;

    public void print() {
        System.out.println("Display1{" +
                "temperature=" + temperature +
                ", humidity=" + humidity +
                ", pressure=" + pressure +
                '}');
    }

    @Override
    public void update(int temp, int pressure, int humidity) {
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;

        print();
    }
}
