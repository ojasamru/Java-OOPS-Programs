class TrafficLight {
    String lightColor;

    TrafficLight(String color) {
        lightColor = color;
    }

    void showSignal() {
        System.out.println("Traffic Light is: " + lightColor);
        for (long i = 0; i < 5000000000L; i++); 
    }

    public static void main(String[] args) {
        new TrafficLight("Red").showSignal();
        new TrafficLight("Yellow").showSignal();
        new TrafficLight("Green").showSignal();
    }
}

