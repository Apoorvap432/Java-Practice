abstract class Shape {
    String color = "red";       //shape ka color store krega 
    abstract double area();     //abstract method- iska implementation child class degi
    public abstract String toString();  //abstract method
    
    //constructor - jb bhi child object bnega to ye call hoga 
    public Shape(String color){
        System.out.println("Shape constructor is called");
        this.color = color;     //color initialize ho rha hai 
    }

    public String getColor(){
        return color;
    }
}


//===================CIrcle=====================

class Circle extends Shape {
    double radius;

    //circle constructor
    public Circle(String color, double radius){ 
        super(color);       //parent class (Shape) ka constructor call hoga
        System.out.println("Circle constructor called");
        this.radius = radius;      //radius initialize kia 
    }

    //area() method ka implementation (Circle ka area formula)
    @Override
    double area(){
        return Math.PI * Math.pow(radius, 2);
    }

    //toString() ka implementation
    @Override
    public String toString(){
        return "The color of Circle is: " + super.getColor() + "\nThe area of circle is: " + area();
    }
}


//=====================Rectangle================

class Rectangle extends Shape {
    double width;
    double length;

    public Rectangle(String color, double length, double width){
        super(color);
        System.out.println("Rectangle cconstructor is called!");
        this.length = length;
        this.width = width;
    }

    @Override
    double area(){
        return length*width;
    }

    @Override
    public String toString(){
        return "The color of rectangle is: " + super.getColor() + "\nThe area of rectangle is: " + area();
    }
}

class Triangle extends Shape{
    double base;
    double height;

    //constructor call krege
    public Triangle(String color, double base, double height){
        super(color);
        System.out.println("Triangle constructor called");
        this.base = base;
        this.height = height;
    }

    @Override
    double area(){
        return 0.5*base*height;
    }

    @Override 
    public String toString(){
        return "The color of rectangle is: " + super.getColor() + "\nThe area is: " + area();
    }
}


public class Abstraction {
    public static void main(String[] args) {
        Shape s1 = new Circle("Red", 2.2);
        Shape s2 = new Rectangle("Yellow", 3, 4);
        Shape s3 = new Triangle("Blue", 4, 3);

        System.out.println(s1.toString());
        System.out.println(s2.toString());
        System.out.println(s3.toString());

    }
    
}
