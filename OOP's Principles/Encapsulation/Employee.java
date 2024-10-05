package introduction.OOP.Encapsulation;

public class Employee {
     private String name;
     private int age;
     private double salary = 90000;
     private String project;

     Employee(){
         this.name = null;
         this.age = 0;
         this.project = null;
     }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
         if(age > 18)
             this.age = age;
         else
             System.out.println("Invalid Age Entered! Try Again :)");
    }

    public double getSalary() {
        return salary;
    }
    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public void greeting(){
        System.out.println("Hello, " + this.name);
    }
}
