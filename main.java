public class main {
    public static void main(String a[]){
        int nums[] = new int[4];
        System.out.println(nums[1]);
        System.out.println();
        nums[1] = 6;
        nums[0] = 2;
        nums[2] = 9;
        nums[3] = 5;
        for (int i=0; i<=3; i++){
            System.out.println(nums[i]);
        }
    }

}
