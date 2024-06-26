public class Node <T> {
public T data;
public Node<T> next; 
 public Node<T> previous;

public Node () {
 data = null; next = null; previous = null;
}
public Node (T val) {
     data = val;
    next = null;
    previous= null;
}
@Override
public String toString() {
    return "Node [data=" + data + ", next=" + next + ", previous=" + previous + "]";
}
public T getData() {
    return data;
}
public void setData(T data) {
    this.data = data;
}
public Node<T> getNext() {
    return next;
}
public void setNext(Node<T> next) {
    this.next = next;
}
public Node<T> getPrevious() {
    return previous;
}
public void setPrevious(Node<T> previous) {
    this.previous = previous;
}
}
