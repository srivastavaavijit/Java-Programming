package introduction.OOP.AbstractClasses;

public class Main {
    public static void main(String[] args) {
        Car c = new Car("Jaguar");

        c.start();

        c.call();

        Vehicle.greeting();

        c.set_price(20000);

        c.get_price();

    }
}
