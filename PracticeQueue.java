public class PracticeQueue {
    public static void main(String[] args) {
    myQueue myqueue = new myQueue();
    myqueue.enqueue(3);
    myqueue.enqueue(3);
    System.out.println(myqueue.dequeue());
    myqueue.enqueue(3);
    myqueue.enqueue(3);
    myqueue.enqueue(3);
    myqueue.show();
    }
}

class myQueue{
    private int front = 0;
    private int rear = -1;
    private int size = 0;
    private int[] arr = new int[4];
    public void enqueue(int i){
        if (!isFull()){
        rear = (rear + 1)%4;
        arr[rear] = i;
        size++;}
    }
    public int dequeue(){
        if (!isEmpty()){
        front = (front+1)%4;
        size--;
        return arr[front-1];}
        else{
            return Integer.MIN_VALUE;
        }
    }

    public int peek(){
        if (!isEmpty())
            return arr[front];
        else
            return Integer.MIN_VALUE;

    }
    public void show(){
        for (int[] i = new int[]{front, 0}; i[1] < size; i = new int[]{(i[0]+1)%4, i[1]+1}){
            System.out.print(arr[i[0]]);
        }
        System.out.println();
    }
    public boolean isFull(){
        return size == 4;
    }
    public boolean isEmpty(){
        return size == 0;
    }
}