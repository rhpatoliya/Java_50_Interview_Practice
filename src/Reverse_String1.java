import java.util.Scanner;

public class Reverse_String1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("please enter any string or name ");
        String name = s.nextLine();
        System.out.println("Reverse of this name is = " + reverse(name));

    }
    private static String reverse(String name) {
        String result = "";
        for (int i = name.length() - 1; i >= 0; i--)
            System.out.println(name.charAt(i));
        return result;
    }
}
