class Animal {
    void cry() {
        System.out.println("Crying...");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Barking...");
    }
}

class Puppy extends Dog {
    void whimper() {
        System.out.println("Whimpering...");
    }
}

public class AnimalTest {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.bark();
        dog.cry();
        
        Puppy puppy = new Puppy();
        puppy.whimper();
        puppy.bark();
        puppy.cry();
    }
}