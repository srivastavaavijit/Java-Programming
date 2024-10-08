package introduction.OOP.Inheritance;

public class Main {
    public static void main(String[] args) {
//        Box box1 = new Box(4.6, 7.9, 8.3);
//        Box box2 = new Box(box1);
//
//        System.out.println(box1.h + " " + box1.w);
//
//        BoxWeight box3 = new BoxWeight();
//        System.out.println(box3.h + " " + box3.weight);
//
//        BoxWeight box4 = new BoxWeight(2, 3, 4, 8);

        Box box5 = new BoxWeight(2, 3, 4, 8);
        System.out.println(box5.h + " " + box5.w);
//        box5.weight;
        box5.information();
        Box.greeting();
//        System.out.println(box5.weight);

        // Box box5 -> Type of reference variable.
        // new BoxWeight() -> Type of object.
        // It is actually the type of reference variable that determines what members can be accessed.


        // there are many variables in both parent and child classes.
        // you are given access to variable that are in reference type i.e. BoxWeight.
        // hence, you should have access to weight variable.
        // this also means, that the ones you are trying to access should be initialised.
        // but here, when the object itself is of type parent class, how will you call the constructor of child class.

//        BoxWeight box6 = new Box(2, 3, 4);
//        System.out.println(box6);

        // the point is, in inheritance, the below classes know about the upper classes,
        // but the upper classes don't know about the inner classes.

//        Box.greeting();
    }
}
