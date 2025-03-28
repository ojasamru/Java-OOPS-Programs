abstract class SmartDevice {
    abstract void turnOn();
    abstract void turnOff();
}

class SmartLight extends SmartDevice {
    void turnOn() {
        System.out.println("Smart Light is ON.");
    }

    void turnOff() {
        System.out.println("Smart Light is OFF.");
    }
}

public class SmartHome {
    public static void main(String[] args) {
        SmartLight light = new SmartLight();
        light.turnOn();
        light.turnOff();
    }
}