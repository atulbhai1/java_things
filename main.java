public class main {
    public static void main(String a[]){
        int nums[][] = new int[4][2];
        System.out.println(nums[1]);
        System.out.println();
        nums[1][1] = 6;
        nums[0][1] = 2;
        nums[2][1] = 9;
        nums[3][1] = 5;
        nums[1][0] = 16;
        nums[0][0] = 12;
        nums[2][0] = 19;
        nums[3][0] = 15;
        for (int i=0; i<=3; i++){
            for (int j=0; j<=1; j++){
                System.out.print(nums[i][j]+" ");
            }
            System.out.println();
        }
    }

}
