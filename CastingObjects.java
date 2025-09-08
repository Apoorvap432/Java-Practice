// CastingObjectsExample.java

class Vehicle {
    void start() {
        System.out.println("Vehicle is starting...");
    }
}

class Car extends Vehicle {
    void start() {
        System.out.println("Car is starting with a key...");
    }

    void playMusic() {
        System.out.println("Car is playing music");
    }
}

public class CastingObjects {
    public static void main(String[] args) {

        // ----- Upcasting -----
        // sub class to super class
        Vehicle v = new Car(); // Car object is referenced by Vehicle type
        v.start();             // ✅ Calls Car's start() (runtime polymorphism)


        // ----- Downcasting -----
        Car c = (Car) v;       // Safe: v actually refers to a Car object
        c.start();             // ✅ Car's start()
        c.playMusic();         // ✅ Car specific method

        // ----- Unsafe Downcasting Example -----
        // Vehicle v2 = new Vehicle(); 
        // Car c2 = (Car) v2;   // ❌ Runtime error: ClassCastException
        // c2.playMusic();
    }
}
