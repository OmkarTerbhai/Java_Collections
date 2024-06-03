import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Set<Integer> st = new HashSet<>();

        st.add(1);
        st.add(2);
        st.add(3);
        st.add(4);
        st.add(4);
        st.add(4);


        System.out.println(st);
    }
}
