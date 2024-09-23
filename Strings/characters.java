package DSAFoundation.Strings.Basics;

import java.util.Scanner;

public class characters {
    public static void main(String[] args) {

        // syntax to create a character: char variable_name = 'character';
        char ch = '$';
        System.out.println((int)ch); // ASCII value of character.

        // Rules Of Characters:

        // 1. We can perform any Mathematical operation with them. The ide is that the
        // character is converted into ASCII value and then operation is performed.

        System.out.println('A' + 25);

        int var = ch + 2;
        System.out.println(var);

        // 2. TypeCasting: char -> int: Implicitly type-casted.
        // int -> char: Should be typecasted explicitly.

        int x = 'c'; // Implicit conversion.
        System.out.println(x);

        char ch2 = 2;
        ch2 = (char)(ch2 + 2); // Explicit Conversion.
        System.out.println(ch2);

        // 3. Taking character as an input from the user.

        Scanner in = new Scanner(System.in);

        char ch3 = in.nextLine().charAt(0); // Point is we are taking string as an input and just taking
                                            // first character of it.
        System.out.println(ch3);

    }
}
