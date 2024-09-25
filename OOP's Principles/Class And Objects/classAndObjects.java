package introduction.OOP.Basics;

public class classAndObjects {
    public static void main(String[] args) {

//        student kunal = new student(20, "Kunal Kushwaha", 84.5f);
//        System.out.println(kunal.rno);
//        System.out.println(kunal.name);
//        System.out.println(kunal.marks);
//
//        kunal.changeName("Shoe Lover");
//        kunal.greeting();
//
//        student random = new student(kunal);
//        System.out.println(random.name);

//        student random2 = new student();
//        System.out.println(random2.name);

        student one = new student();
        student two = one;

        one.name = "Something something";

        System.out.println(two.name);
    }
}

class student{
    int rno;
    String name;
    float marks;

    student(student other){
        this.rno = other.rno;
        this.name = other.name;
        this.marks = other.marks;
    }

    student(){
        // calling one constructor from other.
        // internally: new student(13, "default person", 98.6f);
        this(13, "default person", 98.6f);
    }

    student(int input_rno, String input_name, float input_marks){
        this.rno = input_rno;
        this.name = input_name;
        this.marks = input_marks;
    }

    void greeting(){
        System.out.println("Hello, My name is: " + this.name);
    }

    void changeName(String newName){
        this.name = newName;
    }
}
