package introduction.Basics;

import java.util.Scanner;
import java.io.IOException;

public class inputFromUser {
    public static void main(String[] args) throws IOException {

        // BufferedReader Class:
//        BufferedReader bfn = new BufferedReader(
//                new InputStreamReader(System.in));
//
//        String str = bfn.readLine();
//        System.out.println("Entered string: " + str);
//
//        int num = Integer.parseInt(bfn.readLine());
//        System.out.println("Entered number: " + num);

        // Scanner Class:
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        System.out.println("Entered String: " + str);

        int num = sc.nextInt();
        System.out.println("Entered number: " + num);
    }
}
