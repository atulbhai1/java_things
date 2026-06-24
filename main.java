import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class main {
    public static void main(String a[]) {
        List<Integer> nums = Arrays.asList(7, 5, 75, 2, 9);
        Consumer<Integer> con = n -> System.out.println(n);
        Stream<Integer> s1 = nums.stream();

        Stream<Integer> s2= s1.filter(n -> n % 2 == 0);
        s2.forEach(n -> System.out.println(n));
    }

}
