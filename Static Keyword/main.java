package introduction.OOP.staticKeyword;

public class Main {
    public static void main(String[] args) {

        //we don't need to import the class since it is declared in the same package.
        Human kunal = new Human(22, "Kunal Kushwaha", 100000, false);
        Human Rahul = new Human(34, "Rahul", 150000, true);

        System.out.println(kunal.name);

        System.out.println(Human.population);
        System.out.println(Human.population);

        fun();

        Main fun = new Main();
        fun.temp_fun();
    }

    static void fun(){

        //non-static member cannot be accessed from static member.
        // greeting();

        Main obj = new Main();
        obj.greeting();
    }

    void temp_fun(){
        greeting();
    }

    //something which is not static belongs to an object.
    // to access this member, object is must be required.
    void greeting(){
        System.out.println("Hello World");
    }
}
