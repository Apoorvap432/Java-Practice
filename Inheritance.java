class Animal {
    void eat(){
        System.out.println("This animal eats");
    }
}

class Dog extends Animal{
    void bark(){
        System.out.println("Dog barks!");
    }
}

class Cat extends Animal {
    void voice(){
        System.out.println("Cat makes the sound Meow!");
    }
}

public class Inheritance {
public static void main(String[] args) {
    Dog myDog = new Dog();
    Cat myCat = new Cat();
    myDog.bark();
    myDog.eat();
    myCat.voice();
    myCat.eat();
}
}