package introduction.OOP.staticKeyword;

// class to show initialisation of static variables.
public class staticInt {
    static int a = 4;
    static int b;

    // initialisation of static variable can be done using static block.
    // Static block is exactly executed once when the class loads for the very first time and it assigns values to the static members.
    static{
        System.out.println("I am in static block");
        b = a * 5;
    }

    public static void main(String[] args) {
        staticInt obj = new staticInt();
        System.out.println(staticInt.a + " " + staticInt.b);

        staticInt.a += 3;
        System.out.println(staticInt.a + " " + staticInt.b);

        staticInt obj2 = new staticInt();
        System.out.println(staticInt.a + " " + staticInt.b);
    }
}
