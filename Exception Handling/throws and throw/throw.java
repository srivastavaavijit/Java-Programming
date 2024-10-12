package introduction.ExceptionHandling.throwsAndthrow;

import java.util.Scanner;

public class Throw {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        System.out.println("Enter age:");
        int age = in.nextInt();

        if(age > 100){

            myException.ageGreaterThan100();

//            myException e = new myException("Exception occured.");
//            System.out.println(e);
        }

    }
}

class myException extends RuntimeException{

//    public myException(String message){
//        super(message);
//    }

   public static void ageGreaterThan100(){
       // throw is used to create custom exceptions.
        throw new ArithmeticException("Age greatet than 100");
   }
}
