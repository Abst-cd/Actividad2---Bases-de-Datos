import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main{
    public static void main(String[] args) throws IOException{
    BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));   

        Queue<String> colaStringTareas = new Queue<String>();

        Queue<String> q = new Queue<>();
        q.enqueue("primero");
        q.enqueue("segundo");
        q.enqueue("tercero");

        System.out.println("Queue funcionando despues de agregarle cosas:");
        q.verTodaQueue();
        
        System.out.println("Stack funcionando despues de agregarle cosas");

        Stack<String> stack = new Stack<>();
        stack.push("primero en insertar en codigo");
        stack.push("segundo instertar codigo");
        stack.push("tercero instertar codigo");

        stack.displayStack();

        
        
        byte respuesta = 0;
        do {
        System.out.println("Menu opciones");
        System.out.println("1. Sobrecarga CPU"); //Demostracion de llegar al Max de cpu
        System.out.println("2. abrir tareas");
        System.out.println("3. Salir");
        System.out.println("QUE DESEA HACER, 1/2?");
        respuesta = Byte.parseByte(entrada.readLine());
        // variables para saber stats del cpu
        int CPUmax = 100;
        int CPUWhileIdle = 5;
        int Total = CPUWhileIdle;

        int porcentajeGoogle = 30;
        int porcentajeOpera = 40;
        int porcentajeSpotify = 31;
        int porcentajeFireFox = 18;

        switch(respuesta){

            case 1:
                //OVERCLOCK CPU USAGE, abrir todo para que el sistema solito cierre un programa
           Queue<String> colaStringGoogle = new Queue<String>();
           System.out.println("CPU USAGE: " + (Total = CPUWhileIdle));
           
            colaStringGoogle.enqueue("Google.exe");
            System.out.println("Abriendo Google...");
            System.out.println("Google abierto");
            Total += porcentajeGoogle;
            System.out.println("CPU: "+ Total);
            System.out.println("----------------");

            colaStringGoogle.enqueue("opera.exe");
            System.out.println("Abriendo opera...");
            Total += porcentajeOpera;
            System.out.println("CPU: "+ Total);
            System.out.println("----------------");

            colaStringGoogle.enqueue("spotify.exe");
            System.out.println("Abriendo spotify...");
            Total += porcentajeSpotify;
            System.out.println("CPU: "+ Total);

            System.out.println("----------------");

            colaStringGoogle.verTodaQueue();


            if(Total >= CPUmax){
                System.out.println("CPU al 100%, cerrando: " + colaStringGoogle.peek());
                colaStringGoogle.dequeue();
                colaStringGoogle.verTodaQueue();

            }


           
            break;
            case 2:
                //menu real donde el usuario abre y cierra programas usando colas
                int opcionesT = 0;
            do{
                System.out.println("Que tarea quiere abrir?");
                System.out.println("CPU Usage: " + (Total ));
                System.out.println("----------------------");
                System.out.println("1. Google");
                System.out.println("2. Opera");
                System.out.println("3. FireFox");
                System.out.println("4. Spotify");
                System.out.println("5. Ver Tareas");
                System.out.println("6. Eliminar Tareas");
                System.out.println("7. Salir");

              

                opcionesT = Integer.parseInt(entrada.readLine());
                
                    switch(opcionesT){
                        case 1:
                            if(Total + porcentajeGoogle <= CPUmax){
                                colaStringTareas.enqueue("google.exe");      
                                System.out.println("Google abierto y en cola");
                                Total += porcentajeGoogle;
                            } else {
                                System.out.println("no la puedes meter, se sobrecargara el cpu!");
                            }


                            break;
                        case 2:
                            if(Total + porcentajeOpera <= CPUmax){
                                colaStringTareas.enqueue("opera.exe");      
                                System.out.println("opera abierto y en cola");
                                Total += porcentajeOpera;
                            } else{
                                System.out.println("no la puedes meter, se sobrecargara el cpu!");

                            }
                            break;
                        case 3:
                            if(Total + porcentajeFireFox <= CPUmax){
                                colaStringTareas.enqueue("firefox.exe");      
                                System.out.println("firefox abierto y en cola");
                                Total += porcentajeFireFox;
                            } else {
                                System.out.println("no la puedes meter, se sobrecargara el cpu!");

                            }
                            break;
                        case 4:
                            if(Total + porcentajeSpotify <= CPUmax){
                                colaStringTareas.enqueue("spotify.exe");      
                                System.out.println("spotify abierto y en cola");
                                Total += porcentajeSpotify;
                            } else{
                                System.out.println("no la puedes meter, se sobrecargara el cpu!");

                            }

                            break;
                        case 5:
                        System.out.println("Tareas Activas:");
                        colaStringTareas.verTodaQueue();
                            break;
                        case 6:

                        System.out.println("Cerrando ultima tarea abierta...");

                        String ultimoagregado = colaStringTareas.peek();
                        if (ultimoagregado.equals("google.exe")){
                            Total-= porcentajeGoogle;
                        } else if (ultimoagregado.equals("opera.exe")){
                            Total-=porcentajeOpera;
                        } else if (ultimoagregado.equals("firefox.exe")){
                            Total -= porcentajeFireFox;

                        } else if (ultimoagregado.equals("spotify.exe")){
                            Total-= porcentajeSpotify;
                        }
                        colaStringTareas.dequeue();
                            break;

                        case 7:
                            System.out.println("Regresando al menu principal");
                            break;
                        
                            
                    } 
                
                    } while(opcionesT != 7);

                break;
            case 3:
                System.out.println("Saliendo...");
                return;
                
        }
            

    } while
        (respuesta != 3);
    
}
}