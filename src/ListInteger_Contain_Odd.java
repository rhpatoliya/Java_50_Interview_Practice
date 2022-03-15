import java.util.ArrayList;
import java.util.List;

public class ListInteger_Contain_Odd {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(10);
        list.add(10);
        list.add(20);
        list.add(4);
        list.add(3);
        //first method
        System.out.println(checkOddNumberIntoList(list));

        //second method
        System.out.println(onlyOddNumbers(list));
    }

    public static boolean checkOddNumberIntoList(List<Integer> list) {
        for(int i : list){
            if(i%2 ==0)
                return false;
        }
        return true;
    }

    public static boolean onlyOddNumbers(List<Integer> list) {
        return list
                .parallelStream() // parallel stream for faster processing
                .anyMatch(x -> x % 2 != 0); // return as soon as any elements match the condition
    }
}
