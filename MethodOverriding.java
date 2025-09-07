class Animal{
    public void AnimalSound(){
        System.out.println("Kuch to awaj hai!");
    }
}

class Dog extends Animal {
    @Override
    public void AnimalSound(){
        System.out.println("bark");
    }
}

class Cat extends Animal{
    @Override
    public void AnimalSound(){
        System.out.println("Meow");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Animal a1 = new Dog();
        Animal a2 = new Cat();

        a1.AnimalSound();
        a2.AnimalSound();
        
    }
    
}
