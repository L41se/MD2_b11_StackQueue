package Bai_2;

public class Test {
    public static void main(String[] args) {
        MyLinkedListQueue queue = new MyLinkedListQueue();
        queue.enqueue(30);
        queue.dequeue();
        queue.enqueue(40);
        queue.enqueue(50);
        queue.enqueue(60);
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(70);
        queue.enqueue(80);
        System.out.println("Dequeued item is: " + queue.dequeue().key);
    }
}
