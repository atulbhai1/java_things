public class LinkedList {
    public static void main(String args[]){
        myLinkedList nums = new myLinkedList();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.addFirst(4);

    }
}

class myLinkedList {
    Node head = null;
    public void add(int i){
        Node newNode = new Node(i);
        Node current = head;
        if (head==null) {
            head = newNode;
        }
        else {
            while (current.next!=null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }
    public void printValues(){
        Node current = head;
        while (current!=null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
    public void addFirst(int i){
        Node newNode = new Node(i);
        newNode.next = head;
        head = newNode;
    }
    public void delete(int i){
        Node current = head;
        while (current.next!=null && current.next.data!=i){
            current = current.next;
        }
        if (current.next!=null) {
            current.next = current.next.next;
        }
    }
}

class Node{
    int data;

    public Node(int data) {
        this.data = data;
    }

    Node next;

}
