import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class main {
    public static void main(String a[]) {
        List<Integer> nums = Arrays.asList(7, 5, 75, 2, 9);
        //Stream<Integer> stream = nums.stream();
        int sum = 0;
        for (int i=0;i<nums.size();i++){
            if (nums.get(i)%2==0) {
                sum += 2*(nums.get(i));
            }
        }
        nums.forEach(n -> System.out.println(n));
    }

}
