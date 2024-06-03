import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDemo {

    public static void main(String[] args) {
        List<Integer> li = new ArrayList<>();

        li.add(2);
        li.add(3);
        li.add(4);

        li.addAll(Arrays.asList(78,56,89));

        System.out.println(li);

        /**
         * Passing wrapper class object to remove to call the
         * List.remove(Object o) method as if we pass a primitive
         * int value, it will be treated as a primitive and hence
         * the List.remove(int index) will be called.
         */
        Integer val = 56;
        li.remove(val);

        System.out.println(li);

    }
}
