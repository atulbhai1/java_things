void main() {
    int nums[] = {6, 2, 5, 8, 4, 7, 3, 9, 11, 83, 29, 291, 1};
    System.out.println("Before Sorting:");
    for (int num :nums){
        System.out.println(num);
    }
    int size = nums.length;
    int temp = 0;
    for (int i=0;i<size;i++){
        int minIndex = i;
        for (int j=i+1;j<size;j++){
            if (nums[j] < nums[minIndex]){
                minIndex = j;
            }
        }
        temp = nums[i];
        nums[i] = nums[minIndex];
        nums[minIndex] = temp;
    }
    System.out.println("After Sorting:");
    for (int num :nums){
        System.out.println(num);
    }
}