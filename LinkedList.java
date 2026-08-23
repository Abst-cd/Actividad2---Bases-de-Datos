    //re utilizacion de codigo de la actividad 1
    public class LinkedList<T>{
    private Node<T> head;
    private Node<T> tail;


    public void insert(T d){
      Node<T> nuevoNodo = new Node<>(d, null);

      if(head == null){
          head = nuevoNodo;
          tail = nuevoNodo;
      } else {
        Node<T> current = head;
        while(current.getNext() != null){
            current = current.getNext();
        }
        current.setNext(nuevoNodo);

        tail = nuevoNodo;
      }
    }

   


    public void display(){
        Node<T> current = head;
        while(current != null){
            System.out.println(current.getData());
            current = current.getNext();
        }
    }

    public T getHead(){
        if(this.head != null){
            return this.head.getData();
        }
        return null;
    }

     public T getTail(){
        if (this.tail !=null){
            return this.tail.getData();
        }
        return null;
    }

@Override
public String toString() {
    String resultado = "";

    Node<T> current = head;

    while (current != null) {
        resultado += current.getData() + " ";
        current = current.getNext();
    }

    return resultado;
}

}

