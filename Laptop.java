class Laptop {
    String brand;
    double ram;
    
    void displaySpecs() {
        System.out.println("Brand: " + brand + ", RAM: " + ram + "GB");
    }
}

public class Main { 
    public static void main(String[] args) {
        Laptop myLaptop = new Laptop();
        myLaptop.brand = "HP";
        myLaptop.ram = 512;
        myLaptop.displaySpecs();
    }
}