package introduction.OOP.Basics;

class Person{
    private String name;

    public Person(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void greet(Person otherPerson){
        System.out.println("Hello " + otherPerson.getName() + " ! My name is " + this.name);
    }
}
public class objectCommunication {
    public static void main(String[] args) {
        Person Alice = new Person("Alice");
        Person Bob = new Person("Bob");

        Alice.greet(Bob);
    }
}
