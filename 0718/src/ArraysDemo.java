import java.util.Arrays;
import java.util.List;

public class ArraysDemo {
    public static void main(String[] args) {
        // List<Integer> list = Arrays.asList(4,6,8,1,2);
        // List<String> list1 = Arrays.asList("포엘", "포포링", "포포", "포에리");
        int [] array ={5,7,1,2,7,2,9,5};
        Arrays.sort(array);
        for(int a : array) System.out.print(a + ",");
    }
}
