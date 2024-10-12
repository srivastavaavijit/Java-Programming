package introduction.ExceptionHandling.throwsAndthrow;

public class Throws {
    public static void main(String[] args) {
       int[] a = new int[7];

       try{
           System.out.println(getNumberFromArray(a));
       } catch(Exception e){
           System.out.println("Catched the exception: " + e.getMessage());
       }

    }
    static int getNumberFromArray(int[] a) throws ArrayIndexOutOfBoundsException {
        return a[10];
    }
}
