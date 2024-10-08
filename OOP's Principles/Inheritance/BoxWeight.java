package introduction.OOP.Inheritance;

public class BoxWeight extends Box {
    double weight;

    BoxWeight(){
        this.weight = -1;
    }

    BoxWeight(BoxWeight other){
        super(other);
        this.weight = other.weight;
    }

//    @Override
    static void greeting(){
        System.out.println("Hello, Welcome to BoxWeight Class!");
    }

    BoxWeight(double l, double h, double w, double weight){

        //  if super keyword is not used then the default constructor of the parent class will be called.
        super(l,h,w); // what is this? call the parent class constructor.
        // used to initialise values present in parent class.
        this.weight = weight;

        // super keyword can be directly used to access member of parent class.
//        System.out.println(super.w);

        // Although subclass includes members of base class but it cannot access private members of the base class.
        // super keyword generally calls the constructor of the  class just above the called class.
    }
}


