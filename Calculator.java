class Calculator {
    int multiply(int a, int b) {
        return a * b;
    }
    double multiply(double a, double b) {
        return a * b;
    }
    
    public static void main(String[] args) {
        Calculator obj = new Calculator();
        System.out.println("Product (int): " + obj.multiply(44, 15));
        System.out.println("Product (double): " + obj.multiply(7.5, 9.5));
    }
}
