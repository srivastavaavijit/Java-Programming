package introduction.OOP.AbstractClasses;

public abstract class Vehicle {

    // static variable and methods can be declared inside abstract class.
    static int price = 70000;

    boolean is_petrol;

    private String brand;

    public void set_price(int price){
        Vehicle.price = price;
    }

    public void get_price(){
        System.out.println(Vehicle.price);
    }

    public Vehicle(String brand, boolean is_petrol){
        this.brand = brand;
        this.is_petrol = is_petrol;
    }
    // abstract method;
    public abstract void start();

    //  concrete method;
    public void displayBrand(){
        System.out.println("Brand: " + brand);
    }

    static void greeting(){
        System.out.println("Thanks for buying the car.");
    }

}
