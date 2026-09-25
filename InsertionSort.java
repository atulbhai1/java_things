public class InsertionSort {
    public static void main(String[] args){
        int nums[] = {6, 2, 5, 8, 4, 7, 3, 9, 11, 83, 29, 291, 1};
        System.out.println("Before Sorting:");
        for (int num :nums){
            System.out.println(num);
        }

        for (int i=1; i<nums.length;i++){
            int key = nums[i];
            int j = i-1;
            while (j>=0 && nums[j] > key){
                nums[j+1] = nums[j];
                j--;
            }
            nums[j+1] = key;
        }

        System.out.println("After Sorting:");
        for (int num :nums){
            System.out.println(num);
        }
    }}
