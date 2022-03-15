public class Reverse_String {
    public static void main(String[] args) {
       //First Method
        System.out.println(reverse("RenukaPatoliya"));
        //Second Method
        System.out.println(reverse1("RenukaAsodaria"));


        //Third Method
        String s = "Shiva Patoliya";
        String result = new StringBuffer(s).reverse().toString();
        System.out.println(result);

    }

    //First Method
    public static String reverse1(String s) {
        if (s == null)
            throw new IllegalArgumentException("Null is not valid input");

        String result = "";
        for(int i =s.length() - 1; i>0;i--)
           result = result + (s.charAt(i));

        return result;
    }
    //Second Method
    public static String reverse(String s) {
        if (s == null)
            throw new IllegalArgumentException("Null is not valid input");

        StringBuilder stringBuilder = new StringBuilder();
        char[] chars = s.toCharArray();
        for(int i = chars.length - 1; i>= 0; i--)
            stringBuilder.append(chars[i]);
        //System.out.println(chars);
        return  stringBuilder.toString();
    }
}
