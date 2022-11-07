package AnagramUsingStack;

public class Stack<T extends Comparable<T>>{
    Node head;
    Node tail;

    public Stack() {
        this.head = head;
        this.tail = tail;
    }

    public void push(T item) {
        Node node =new Node(item);
        node.next =head;
        head = node;
    }
    public void display() {
        Node<T> temp = head;
        while (temp != null) {
            System.out.println(temp.data + " ");
            temp = temp.next;

        }
    }
}