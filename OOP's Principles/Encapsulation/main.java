package introduction.OOP.Encapsulation;

public class main {
    public static void main(String[] args) {

        Employee obj = new Employee();
        obj.setName("Rahul");
        obj.setAge(24);
        obj.setProject("Backend");

        Employee obj2 = new Employee();
        obj2.setName("Kunal");
        obj2.setAge(22);
        obj2.setProject("Frontend");

        System.out.println(obj.getName() + " " + obj.getAge() + " " + obj.getSalary() + " " + obj.getProject());

        System.out.println(obj2.getName() + " " + obj2.getAge() + " " + obj2.getSalary() + " " + obj2.getProject());

        obj.greeting();

        obj2.greeting();
    }
}
