package Bai_2;

public class MyLinkedListQueue {
    public Node head;
    public Node tail;

    public MyLinkedListQueue(Node head, Node tail) {
        this.head = head;
        this.tail = tail;
    }

    public MyLinkedListQueue(){
    }
    public void enqueue(int key){
        Node n = new Node(key);
        if (this.tail == null){
            this.head = this.tail = n;
            return;
        }
        this.tail.next = n;
        this.head = n;
    }

    public Node dequeue() {
        if (this.head == null)
            return null;
        Node temp = this.head;
        this.head = this.head.next;
        if (this.head == null)
            this.tail = null;
        return temp;
    }


}
