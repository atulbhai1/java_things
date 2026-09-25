public class SearchLinearBinary {
    public static void main(String[] args) {
        int nums[] = new int[1000];
        int target = 501;
        int result = linearSearch(nums, target);
        if (result != -1){
        System.out.println("Found at index " + result);}
        else{
            System.out.println("Not found");
        }

        result = binarySearch(nums, target);
        if (result != -1){
            System.out.println("Found at index " + result);}
        else{
            System.out.println("Not found");
        }

    }
    public static int linearSearch(int[] nums, int target){
        int steps = 0;
        for (int i=0; i<nums.length; i++){
            steps++;
            if (nums[i] == target){
                System.out.println("Found in " + steps + " steps");
                return i;
            }
            //else continues
        }
        System.out.println("Found in " + steps + " steps");
        return -1;
    }
    public static int binarySearch(int[] nums, int target){
        int start = 0;
        int steps = 0;
        int end = nums.length - 1;
        while (start <= end){
            steps++;
            int mid = (start + end)/2;
            if (nums[mid] == target){
                System.out.println("Found in " + steps + " steps");
                return mid;
            }
            else if (nums[mid] < target){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        System.out.println("Found in " + steps + " steps");
        return -1;
    }
    public static int otherBinarySearch(int[] nums, int target, int left, int right){
        int mid = (left + right)/2;
        if (nums[mid] == target){

            return mid;
        }
        else if (nums[mid] < target){
            return otherBinarySearch(nums, target, mid+1, right);
        }
        else{
            return otherBinarySearch(nums, target, left, mid-1);
        }
    }
}
