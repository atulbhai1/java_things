void main() {
    int nums[] = {6, 2, 5, 8, 4, 7, 3, 9, 11, 83, 29, 291, 1};
    System.out.println("Before Sorting:");
    for (int num :nums){
        System.out.println(num);
    }
    int size = nums.length;

    
    
    quickSort(nums, 0, size-1);
    
    
    System.out.println("After Sorting:");
    for (int num :nums){
        System.out.println(num);
    }
}

private void quickSort(int[] nums, int low, int high) {
    if (low < high){
        int pi = partition(nums, low, high);
        quickSort(nums, low, pi-1);
        quickSort(nums, pi+1 ,high);
    }
}

private int partition(int[] nums, int low, int high) {
    int pivot = nums[high];
    int i = low-1;
    for(int j=low;j<=high;j++){
        if (nums[j] < pivot){
            i++;
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
    }
    int temp = nums[i+1];
    nums[i+1] = nums[high];
    nums[high] = temp;

    return i+1;
}

