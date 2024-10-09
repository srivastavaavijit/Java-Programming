package introduction.OOP.Interface;

public interface Animal {

    final static int LEGS = 4;

    public abstract void eat();

    public abstract void sleep();

    default void makeSound(){
        System.out.println("Some sound.");
    }

    static void info(){
        System.out.println("Animal Interface");
    }

}
