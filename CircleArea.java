interface Shape {
    double area();
}

class Circle implements Shape {
    double radius;

    Circle(double r) {
        this.radius = r;
    }

    public double area() {
        return 3.14 * radius * radius;
    }
}

public class Main {
    public static void main(String[] args) {
        Shape c = new Circle(5);
        System.out.println("Area of Circle: " + c.area());
    }
}
