import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListDemo {

    public static void main(String[] args) {
        List<String> li = new LinkedList<>();

        li.add("ABC");
        li.add("DEF");
        li.add("GHI");

        ListIterator<String> listIterator = li.listIterator();

        System.out.println(listIterator.next());
        System.out.println(listIterator.next());
        System.out.println(listIterator.next());

        System.out.println(listIterator.previous());
    }
}
