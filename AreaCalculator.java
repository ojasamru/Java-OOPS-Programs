public class AreaCalculator {
    private double area;

    public AreaCalculator(double length, double width) {
        area = length * width;
        System.out.println("Rectangle Area: " + area);
    }

    public AreaCalculator(double radius) {
        area = Math.PI * radius * radius;
        System.out.println("Circle Area: " + area);
    }

    public AreaCalculator(double height, int base) {
        area = 0.5 * height * base;
        System.out.println("Triangle Area: " + area);
    }

    public static void main(String[] args) {
        new AreaCalculator(10.0, 11.0);
        new AreaCalculator(15.0);
        new AreaCalculator(11.0, 11);
    }
}
