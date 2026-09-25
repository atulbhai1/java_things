public class BubbleSort {
    public static void main(String[] args){
        int nums[] = {6, 2, 5, 8, 4, 7, 3, 9, 11, 83, 29, 291, 1};
        System.out.println("Original array:");
        for (int num :nums){
            System.out.println(num);
        }
        int len = nums.length;
        int temp = 0;
        for (int i=0;i<len;i++){
            for (int j=0;j<len-1-i;j++){
                if(nums[j]>nums[j+1]){
                    temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }

        System.out.println("Sorted array:");
        for (int num :nums){
            System.out.println(num);
        }
    }
}
