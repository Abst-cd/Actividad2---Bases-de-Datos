// re utilizacion de codigo de la actividad 1
public class Node<T>{

private T data;
public Node<T> next;

    public Node(T d, Node<T> nx){
        this.data = d;
        this.next = nx;
        
    }

    public T getData() {
        return data;
    }

    public Node<T> getNext() {
        return next;
    }

   
    public void setData(T d) {
        this.data = d;
    }

    public void setNext(Node<T> nx) {
        this.next = nx;
    }

 
}