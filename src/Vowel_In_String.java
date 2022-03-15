import java.util.Scanner;

public class Vowel_In_String {
    //vowel numbesr are [aeiou]

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter String here");
        String s = sc.nextLine();
        System.out.println(vowel(s));

    }
    public static boolean vowel(String s){

        return s.toLowerCase().matches(".*[aeiou].*");    }

}
