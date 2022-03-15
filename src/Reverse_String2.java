import java.util.Scanner;

public class Reverse_String2 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("please enter any string or name for reverse it" );
            String s = scanner.nextLine();
            String result = reverse(s);
            System.out.println(result);

        }
        public static String reverse(String s){
            String  result = " ";
            for(int i = 0; i < s.length(); i++)
            {
                result += s.charAt(s.length() - i -1);

            }
            return result;
        }
    }
