import java.io.IOException;

public class main{
    public static void main(String[] args) throws IOException{
        System.out.println("holaaaa");

        LinkedList aaa = new LinkedList<>();
        
        aaa.insert("a");


        System.out.println("si");

        Queue q = new Queue<>();
        q.enqueue("aaaaa");
        q.enqueue("bbbbb");
        q.enqueue("ccccc");
        q.dequeue();

        q.verTodaQueue();
        
        System.out.println("Stack:");

        Stack stack = new Stack<>();
stack.push("primero en insertar en codigo");
                stack.push("segundo instertar codigo");

                        stack.push("tercero instertar codigo");

        stack.displayStack();
        stack.pop();
        System.out.println("====================");
        stack.pop();
        stack.displayStack();
        
        
    }
}