public class Queue<T> {
    private Node<T> front;
    private Node<T> tail;
    private int size;

    public Queue() {
        this.front = null;
        this.tail = null;
        this.size = 0;
    }
    //se definen variables y creamos el constructor de la cola

    public boolean isEmpty() {
        return this.front == null;
    }

    public void enqueue(T data) {
        Node nodoToInsert = new Node<>(data, null);
        if (this.isEmpty()) {
            this.front = nodoToInsert;
            this.tail = nodoToInsert;
        } else {
            this.tail.setNext(nodoToInsert);
            this.tail = nodoToInsert;
        }
        size++;

    }
    //metodo para meterle nodos a la cola
    //se crea el nodo para instertar y basicamente dice:
    //"si no hay nada, define como el frente y atras el nodo que vamos a insertar porque sera el unico que hay,
    //si ya existe, la tail sera definida al nodo que estamos insertando

    public void verTodaQueue(){
        Node actual = front;
            System.out.println("[");

        while(actual != null){
            System.out.println(actual.getData());
            actual = actual.getNext();

        }
            System.out.println("]");

    }
    //metodo agregado por mi (no siento este los metodos predeterminados de una Queue), para asegurar que la cola este funcionando,
    //el metodo recorre la cola con la variable "actual" y va imprimiendo sus valores, haciendo que se muestre la cola

    public T dequeue() {
        if (this.isEmpty()) {
            return null;
        }
        T result = this.front.getData();
        this.front = this.front.getNext();
        size--;
        if (this.isEmpty()) {
            this.tail = null;
        }
        return result;
    }
    //metodo de tipo T, basicamente lo que hace es saltarse un nodo para eliminarlo y le resta a la variable de size

    public T peek() {
        if (this.isEmpty()) {
            return null;
        }
        return front.getData();
    }
    //muestra el frente de la cola

    public int size() {
        return size;
    }

   @Override
public String toString() {
    if (isEmpty()) {
        return "[]";
    }

    StringBuilder sb = new StringBuilder();
    Node<T> actual = front;

    while (actual != null) {
        sb.append(actual.getData());

        if (actual.getNext() != null) {
            sb.append(" -> ");
        }

        actual = actual.getNext();
    }

    return "Queue [" + sb.toString() + "]";
}
}