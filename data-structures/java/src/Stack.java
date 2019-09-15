/*
* Stack Class
*
* The stack is built using a Linked List, and performs four basic operations (push, pop, peek and isEmpty)
* All operation run in O(1) time
*
* @author: PDiasG
* @date: 09-15-2019
*
 */

public class Stack<T> {

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

    private Node<T> top = null;

    //Returns the data at the top of the Stack, without removing the element from the Stack
    public T peek() {
        return top.data;
    }

    //Removes the element at the top of the Stack and return its data
    public T pop() {
        T data = top.data;
        top = top.next;
        return data;
    }

    //Add a new element to the top of the Stack
    //@param: <T> data, the data to be added to the Stack
    public void push(T data) {
        Node<T> node = new Node<>(data);
        node.next = top;
        top = node;
    }

    //Returns true if the stack is empty or false if it is not
    public boolean isEmpty() {
        return top == null;
    }
}
