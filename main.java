public class main {
    public static void main(String a[]){
        int nums[][] = new int[4][2];
        System.out.println();
        for (int i=0; i<=3; i++){
            for (int j=0; j<=1; j++){
                int temp = (int)(Math.random()*100);
                nums[i][j] = temp;
                System.out.print(nums[i][j]+" ");
            }
            System.out.println();
        }
    }

}
