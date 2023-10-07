<<<<<<< Updated upstream
public class DoubleLinkedList<T> {
     private Node<T> head;
    private Node<T> current;
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