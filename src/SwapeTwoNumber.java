public class SwapeTwoNumber {
    public static void main(String[] args) {
        int a = 20;
        int b = 40;
        swapNumber(a,b);
        System.out.printf("a is %d, b is %d", a, b); // a is 20, b is 40
    }
/*
    We can’t return multiple variables in Java.
    Since Java is Pass-by-Value and these are primitive data types,
    their values won’t change. For example, below swap function will not change the input integer values.
*/
    private static void swapNumber(int a, int b) {
        b= b +a;
        a= b-a;
        b = b-a;


    }

}
