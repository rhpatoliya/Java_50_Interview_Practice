import java.util.Scanner;

public class SquareRoot_of_givenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("please enter any number here for Square root of this number");
        double sqroot = sc.nextDouble();
        double result = Math.sqrt(sqroot);
        System.out.println(result);
    }
}
