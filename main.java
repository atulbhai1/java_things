import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class main {
    public static void main(String a[]) {
        Comparator<Integer> com = new Comparator<Integer>() {
            public int compare(Integer o1, Integer o2) {
                return ((Integer) (o1%10)).compareTo(o2%10);
            }
        };
        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(51);
        list.add(83);
        list.add(24);
        list.add(65);
        Collections.sort(list, com);
        System.out.println(list);
    }

}
