public class Light implements Device {
    @Override
    public void turnOn() {
        System.out.println("Light is turned ON");
    }

    @Override
    public void turnOff() {
        System.out.println("Light is turned OFF");
    }
    
    public void changeBrightness(int level) {
        System.out.println("Light brightness set to " + level + "%");
    }
}

