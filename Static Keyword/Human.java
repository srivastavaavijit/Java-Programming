package introduction.OOP.staticKeyword;

// Any property that is not dependent on any object, means it is common for all object
// then that property or method is known as static.

// members(variables and methods) declared static can be accessed even without creating objects.

public class Human {
    int age;
    String name;
    int salary;
    boolean married;
    static long population;

    static void message(){
        System.out.println("Hello World");
        //this cannot be used inside static member as this keyword represents object.
//        System.out.println(this.age);
    }

    public Human(int age, String name, int salary, boolean married){
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        // static variables are accessed using class name.
        Human.population  += 1;

        Human.message();
    }
}
