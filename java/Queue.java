/*
 * Queue Class
 *
 * The queue is built using a Linked List, and performs five basic operations (push, pop, peek, isEmpty and search)
 * All operation expect search run in O(1) time. Search run in O(n) time.
 *
 * @author: PDiasG
 * @date: 10-21-2019
 *
 */

import javax.sound.midi.Soundbank;

public class Queue<T> {

    //Node class to build the Linked List
    class Node<T> {
        T data;
        Node next;

        //Constructor for Node class
        //@param: <T> data, the data contained in the Node
        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node<T> head;
    private Node<T> tail;

    Queue() {
        head = null;
        tail = null;
    }

    //Returns the data at the head of the Queue, without removing the element from the Stack
    public T peek() {
        return head.data;
    }

    //Removes the head at the top of the Queue and return its data
    public T remove() {
        T data = head.data;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        return data;
    }

    //Add a new element to the tail of the Queue
    //@param: <T> data, the data to be added to the Queue
    public void add(T data) {
        Node<T> node = new Node<>(data);
        if (tail != null) {
            tail.next = node;
        }
        tail = node;
        if (head == null) {
            head = tail;
        }
    }

    //Returns true if the stack is empty or false if it is not
    public boolean isEmpty() {
        return head == null;
    }

    //Returns the 1-based position of an object in the queue, or -1 if it is not present
    //@param: <T> data, the data to be searched in the Queue
    public int search(T data) {
        Node<T> temp = head;
        int pos = 1;

        while (temp != null) {
            if (temp.data.equals(data)) return pos;
            temp = temp.next;
            pos++;
        }

        return -1;
    }

}
