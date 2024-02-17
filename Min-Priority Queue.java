
//Min-priority queue using linked list data structure in java
import java.util.*;

public class MinPriorityQueue {
    public static void main(String[] args) {
        MinPriorityQueue minPriorityQueue = new MinPriorityQueue();
        minPriorityQueue.insert(5);
        minPriorityQueue.insert(4);
        minPriorityQueue.insert(6);
        minPriorityQueue.insert(3);
        minPriorityQueue.insert(2);
        minPriorityQueue.insert(7);
        minPriorityQueue.insert(1);
        minPriorityQueue.print();
        minPriorityQueue.delete();
        minPriorityQueue.print();
    }

    public void insert(int x) {
        Node newNode = new Node(x);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void print() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }

    public void delete() {
        if (head == null) {
            System.out.println("Queue is empty");
        } else {
            Node current = head;
            Node next = head.next;
            head = head.next;
            current.next = null;
            current = null;
            next = null;
        }
    }
}
