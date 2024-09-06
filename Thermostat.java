public class Thermostat implements Device {
    private int temperature = 22; // default temperature

    @Override
    public void turnOn() {
        System.out.println("Thermostat is turned ON");
    }

    @Override
    public void turnOff() {
        System.out.println("Thermostat is turned OFF");
    }

    public void increaseTemperature() {
        temperature++;
        System.out.println("Temperature increased to " + temperature + "°C");
    }

    public void decreaseTemperature() {
        temperature--;
        System.out.println("Temperature decreased to " + temperature + "°C");
    }
}
