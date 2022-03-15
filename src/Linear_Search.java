import java.util.Scanner;

public class Linear_Search {


        public static void main(String[] args) {
            int arr[] = { 2, 3, 4, 10, 40 };
            Scanner scanner = new Scanner(System.in);
            System.out.println("please eneter here any numbers for linear search from given arraylist");
            int x = scanner.nextInt();
            int result = search(arr, x);
            System.out.println("your valuse is at index " + result);
        }
        public static int search(int arr[], int n)
        {

            for(int i = 0; i < arr.length; i++)
            {
                if (arr[i] == n)

                    return i;
                // System.out.println(arr[i]);

            }
            return -1;
        }
    }


