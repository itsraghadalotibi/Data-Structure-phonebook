public class interface DoubleLinkedList<T> {
    private Node<T> head;
    private Node<T> current;
    private int length = 0; 

    public DoubleLinkedList() { 
        head = current = null;
    }
    public boolean empty() { 
        return head == null;
    }
    public boolean last() {
        return current.next == null;
    }
public boolean first() {
    return current.previous == null;
    }


    
}
