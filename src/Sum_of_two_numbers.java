import java.util.Scanner;

public class Sum_of_two_numbers {

        public static void main(String[] args)
        {
            int i,j;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter your first number");
            i = scanner.nextInt();
            System.out.println("please enter your second number");
            j = scanner.nextInt();
            System.out.println(sum(i,j));
        }
        public static Integer sum(int i, int j){
            int sumOfTwoNumbers = i +j;
            return sumOfTwoNumbers;
        }
    }


