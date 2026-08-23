import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main{
    public static void main(String[] args) throws IOException{
    BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));   

 
        LinkedList<String> aaa = new LinkedList<>();
        
        aaa.insert("a");


        System.out.println("si");

        Queue<String> q = new Queue<>();
        q.enqueue("aaaaa");
        q.enqueue("bbbbb");
        q.enqueue("ccccc");
        q.dequeue();

        q.verTodaQueue();
        
        System.out.println("Stack:");

        Stack<String> stack = new Stack<>();
        stack.push("primero en insertar en codigo");
        stack.push("segundo instertar codigo");
        stack.push("tercero instertar codigo");

        stack.displayStack();
        stack.pop();
        System.out.println("====================");
        stack.pop();
        stack.displayStack();
        
        
        byte respuesta = 0;
        do {
        System.out.println("Menu opciones");
        System.out.println("1. abrir google");
        System.out.println("2. abrir firefox");
        System.out.println("3. Salir");
        System.out.println("QUE DESEA HACER, 1/2?");
        respuesta = Byte.parseByte(entrada.readLine());


        switch(respuesta){
            case 1:
           Queue<String> colaStringGoogle = new Queue<String>();
            colaStringGoogle.enqueue("Google.exe");
            System.out.println("Abriendo Google...");
            colaStringGoogle.verTodaQueue();
            System.out.println("Google abierto");
            System.out.println("Cerrando google...");
            colaStringGoogle.dequeue();
            colaStringGoogle.verTodaQueue();
            break;
            case 2:
                Stack<String> colaStringStack = new Stack<String>();
                colaStringStack.push("Firefox.exe");
                System.out.println("Abriendo FireFox...");
                System.out.println(colaStringStack.peek());
                System.out.println("FireFox abierto");
                System.out.println("Cerrando Firefox...");
                colaStringStack.pop();
                colaStringStack.displayStack();
                break;

        }
        System.out.println("Saliendo...");

    } while
        (respuesta != 3);
    
}
}