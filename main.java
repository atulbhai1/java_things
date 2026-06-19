import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class main {
    public static void main(String a[]) throws InterruptedException {
        List<Integer> nums = new ArrayList<Integer>();
        nums.add(6);
        nums.add(8);
        nums.add(3);
        nums.add(2);


        System.out.println(nums.indexOf(8));

        for (int n : nums){
            System.out.println(n);
        }
    }

}
