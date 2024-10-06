package introduction.OOP.Polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Shapes circle = new Circle();
        Shapes square = new Square();

        // the method that would be called depends on the type of the object.
        circle.area();

        // overriding happens when the object is of child class and,
        // reference type is of parent class.

        // static methods cannot be overridden as overriding depends on objects,
        // and static does not depends upon object.
    }
}
