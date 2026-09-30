public class PracticeQueue {
    public static void main(String[] args) {
    myQueue myqueue = new myQueue();
    myqueue.enqueue(3);
    }
}

class myQueue{
    private int front = 0;
    private int rear = -1;
    private int size = 0;
    private int[] arr = new int[4];
    public void enqueue(int i){
        rear++;
        arr[rear] = i;
        size++;
    }
    public int dequeue(){
        front++;
        return arr[front-1];
    }
    public void show(){
        for (int i = front; i <size; i++){
            System.out.print(arr[i]);
        }
        System.out.println();
    }
}