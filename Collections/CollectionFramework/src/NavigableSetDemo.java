import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetDemo {
    public static void main(String[] args) {
        NavigableSet<Integer> navigableSet = new TreeSet<>();

        navigableSet.add(20);
        navigableSet.add(15);
        navigableSet.add(10);
        navigableSet.add(5);

        System.out.println(navigableSet);

        System.out.println(navigableSet.ceiling(17));
        System.out.println(navigableSet.floor(14));
    }
}
