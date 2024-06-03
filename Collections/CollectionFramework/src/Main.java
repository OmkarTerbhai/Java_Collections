import java.util.Iterator;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        Integer[] arr = new Integer[]{2,3,4,5,6};
        CustomCollectionList<Integer> li = new CustomCollectionList<>(arr);

        for(Integer i : li) {
            System.out.println("Element is : " + i);
        }
    }
}