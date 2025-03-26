class TrafficLight {
    String lightColor;

    TrafficLight(String color) {
        lightColor = color;
    }

    void showSignal() {
        System.out.println("Traffic Light is: " + lightColor);
    }

    public static void main(String[] args) throws InterruptedException {
        TrafficLight red = new TrafficLight("Red");
        red.showSignal();
        Thread.sleep(5000);

        TrafficLight yellow = new TrafficLight("Yellow");
        yellow.showSignal();
        Thread.sleep(5000);

        TrafficLight green = new TrafficLight("Green");
        green.showSignal();
        Thread.sleep(5000);
    }
}
