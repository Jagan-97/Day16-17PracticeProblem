package AnagramUsingStack;

public class Node<T> {
    public Node<T> head;
    private Node<T> front;
    private Node<T> rear;

    public Node<T> next;
    public T data;

    public Node(T data) {
        super();
        this.data = data;
        this.next = null;
    }

    public Node<T> getFront() {
        return front;
    }

    public void setFront(Node<T> front) {
        this.front = front;
    }

    public Node<T> getRear() {
        return rear;
    }

    public void setRear(Node<T> rear) {
        this.rear = rear;
    }
    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}