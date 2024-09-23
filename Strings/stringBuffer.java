package DSAFoundation.Strings.Basics;

public class stringBuffer {
    public static void main(String[] args) {

        StringBuffer str = new StringBuffer("Hello, World");

//        str.append("Hello,");
//        str.append("World ");

        System.out.println(str.charAt(0));

        str.append('A');

        System.out.println(str);

        String s1 = str.toString();

        System.out.println(s1);

    }
}
