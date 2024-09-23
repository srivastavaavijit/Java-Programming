package DSAFoundation.Strings.Basics;

public class characterArray {
    public static void main(String[] args) {

        char[] ch = {'A','l','g','o','p','r','e','p'};

        System.out.println(ch.length);
        System.out.println(ch);

        String str = "Hello, World";

        // string -> character array:
        char[] ch2 = str.toCharArray();

        System.out.println(ch2);

        // Manipulating character array elements:
        ch2[0] = 'M';

        System.out.println(ch2);

        // character array -> string:
        // 1st method:

        String str2 = new String(ch);
        System.out.println(str2);

        // 2nd method: Internal working is same as that of the above method.

        String str3 = " ".valueOf(ch);
        System.out.println(str3);


    }
}
