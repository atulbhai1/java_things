public class main {
    public static void main(String a[]){
        int nums[][] = new int[4][];

        nums[0] = new int[3];
        nums[1] = new int[2];
        nums[2] = new int[4];
        nums[3] = new int[5];
        System.out.println();
        for (int i=0; i<nums.length; i++){
            for (int j=0; j<nums[i].length; j++){
                int temp = (int)(Math.random()*100);
                nums[i][j] = temp;
                //System.out.print(nums[i][j]+" ");
            }
            //System.out.println();
        }

        for (int n[] : nums){
            for (int m: n){
                System.out.print(m+" ");
            }
            System.out.println();
        }
    }

}
