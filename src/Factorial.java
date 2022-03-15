import java.util.ArrayList;
import java.util.Scanner;

public class Factorial {

        static ArrayList arrayList = new ArrayList();

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("please enter here any number");
            int  n = scanner.nextInt();
            System.out.println("multiplications of all factorial number is = " + factorial(n));
            //System.out.println(arrayList);
        }
        public static Integer factorial(Integer n){
            int factorial  = n;
            for(int j = n -1 ; j > 0; j--){
                factorial = factorial * j;
                // System.out.println(j);
                //arrayList.add(j+"*");

            }
            return factorial;
        }
    }
