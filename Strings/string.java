package DSAFoundation.Strings.Basics;

public class string {
    public static void main(String[] args) {

        // Important points:

        // 1. Ways to declare Strings:
        // USing String literal: String created in string pool.
        String str = "Hello, World!";
        System.out.println(str);

        // using String class: String created in Heap memory and got no relation with string pool.
        String str1 = new String("Hello, World!");
        System.out.println(str1);

        // 2. Immutability Of Strings:
//        str.charAt(0) = 'a'; // error as strings cannot be changed.

//        str = str + "Java"; // Here, what happens is new string object is created and str is assigned to it.
//        System.out.println(str);
//         // to avoid changing reference variable, use final keyword in string declaration.

        // 3. Common String Methods:

        // Trim method:
        System.out.println("     Hello      ".trim());

        // Comparison Method: checks if two strings have same value.
        System.out.println(str.equals(str1));

        // Equals Method: checks if both variable points to the same string.
        System.out.println(str == str1);

//        4. String Formatting:
        String formatted = String.format("Hello %s!", "Alice");
        System.out.printf(formatted);

    }
}
