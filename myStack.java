public class myStack {
    private int[] arr = new int[5];
    int top = -1;
    int size;
    public myStack(){
        size = arr.length;
        top = -1;
    }
    public void push(int value){
        top++;
        if (top < size){
        arr[top+1] = value;}
        else{
            System.out.println("Stack Overflow");
        }

    }

    public int pop(){
        if (top >= 0){
            return arr[top--];
        }
        else{
            System.out.println("Stack Underflow");
            return Integer.MIN_VALUE;
        }
    }

    public int peek(){
        if (top >= 0){
            return arr[top];
        }
        else{
            System.out.println("Stack Underflow");
            return Integer.MIN_VALUE;
        }
    }

    public void printStack(){
        for (int i = 0; i <= top; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
