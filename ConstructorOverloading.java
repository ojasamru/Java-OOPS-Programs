class Person {
    String name;
    int age;

    Person() {
        System.out.println("Default Constructor Called");
        name = "Unknown";
        age = 0;
    }

    Person(String n, int a) {
        System.out.println("Parameterized Constructor Called");
        name = n;
        age = a;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    
}

public class ConstructorOverloading {
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person("OJAS", 18);

        p1.display();
        p2.display();
    }
}