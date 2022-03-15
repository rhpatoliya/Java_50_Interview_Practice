public class Fibonacci_Series_Using_Recursion {

    //fibonacci formula n = n-1 + n-2
    //i.e 10 = (10-1) +(10-2) = 9 + 8 = 17
    public static void main(String[] args) {

//this is FibonacciSeries

        printFibonacciSeries(10);

        //By using recursion method
        System.out.println(fibonaciSeries(10));


    }

    //this is recursion method
    public static Integer fibonaciSeries(int n) {
        if(n <=1)
            return n;
        return fibonaciSeries(n-1) + fibonaciSeries(n -2);
    }

    //Second Method
    public static void printFibonacciSeries(int count) {
        int a = 0;
        int b = 1;
        int c = 1;
        for (int i = 1; i <= count; i++) {
            System.out.print(a + ", ");
            a = b;
            b = c;
            c = a + b;
        }
    }
}
