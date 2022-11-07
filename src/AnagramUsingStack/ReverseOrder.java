package AnagramUsingStack;

public class ReverseOrder<T> {
    private Node head;

    public void list() {
        head = null;
    }
    public void add(T data) {

        Node node = new Node(data);
        if (head == null) {
            head = node;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = node;
    }

    public int size() {
        int count = 0;
        Node<T> temp = head;
        while (temp != null) {
            temp = temp.next;
            count++;
        }
        return count;
    }

    public T get(int index) {
        Node<T> temp = head;
        Node<T> prev = null;

        for (int i = 0; i <= index; i++) {
            prev = temp;
            temp = temp.next;
        }
        return (T) prev.data;
    }
}