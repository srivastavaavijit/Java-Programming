package introduction.OOP.Polymorphism;

public class Circle extends Shapes{

    // this will run when object of circle is created.
    // hence it is overriding the parent method.
    @Override // this is called annotation.
    void area(){
        System.out.println("Area is 3.14 * r * r");
    }

}
