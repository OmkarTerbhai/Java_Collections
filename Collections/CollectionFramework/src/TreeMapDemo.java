import java.util.*;

public class TreeMapDemo {
    public static void main(String[] args) {
        NavigableMap<Integer, String> mp = new TreeMap<>();

        mp.put(1, "ABC");
        mp.put(2, "DEF");
        mp.put(3, "GHI");

        System.out.println(mp);

        for(Integer st : mp.keySet()) {
            System.out.println(st);
        }
        System.out.println(mp.floorEntry(4));
    }
}
