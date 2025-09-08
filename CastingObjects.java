class Animals {
    void sound() {
        System.out.println("Some sound");
    }
}

class Dog extends Animals {
    void sound() {
        System.out.println("Bark");
    }

    void fetch() {
        System.out.println("Fetching stick...");
    }
}

public class CastingObjects {
    public static void main(String[] args) {
        Dog d = new Dog();

        // Upcasting (Dog → Animal)
        Animals a = d;  // ✅ safe

        a.sound();     // Output: Bark (runtime polymorphism)
        // a.fetch();  // ❌ Error: Animal class me fetch() nahi hai
    }
}
