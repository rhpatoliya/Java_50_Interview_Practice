import java.util.Scanner;

public class Sum_of_multipleOf_three_five {

        public static void main(String[] args) {
            Scanner scanner  = new Scanner(System.in);
            int n;
            System.out.println("print any number for summation");
            n = scanner.nextInt();
            int sum = sum(n);
            System.out.println(sum);
        }
        public static Integer sum(int n){
            Integer sum = 0;
            for (int i = 1; i <= n; i++) {
                if (i % 3 == 0 || i % 5 == 0) // try to put && here and see the results
                    System.out.println(i);
                {
                    sum = sum + i;   // take out the curly braces that does not effect at all
                }
            }
            return sum;

        }

    }

