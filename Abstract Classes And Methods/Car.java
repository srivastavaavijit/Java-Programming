package introduction.OOP.AbstractClasses;

public class Car extends Vehicle{

    public Car(String brand) {
        super(brand, true);
        System.out.println("Car brand is: " + brand);
    }

    @Override
    public void start() {
        System.out.println("Car is starting.");
    }

    public void call(){
        displayBrand();
    }


}
