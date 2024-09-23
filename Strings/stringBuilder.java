package DSAFoundation.Strings.Basics;

public class stringBuilder {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();

//        System.out.println(sb);

        sb.append(2);
        sb.append(3);

        System.out.println(sb);

        System.out.println(sb.charAt(0) + " " + sb.charAt(1));

    }
}
