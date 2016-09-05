public class Node<T> {
  private Node<T> _next;
  private T _data;
  
  public Node(Node<T> next, T data) {
    _next = next;
    _data = data;
  }
  
  public Node(T data) {
    _next = null;
    _data = data;
  }
  
  public T getData() {
    return _data;
  }
  
  public void setData(T data) {
    _data = data;
  }
  
  public Node<T> getNext() {
    return _next;
  }
  
  public void setNext(Node<T> next) {
    _next = next;
  }
}
