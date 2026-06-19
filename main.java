import java.util.Set;
import java.util.Collection;
import java.util.TreeSet;

public class main {
    public static void main(String a[]) throws InterruptedException {
        Set<Integer> nums = new TreeSet<Integer>();
        nums.add(6);
        nums.add(8);
        nums.add(3);
        nums.add(8);



        for (int n : nums){
            System.out.println(n);
        }
    }

}
