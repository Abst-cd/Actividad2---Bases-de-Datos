import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class mainCalc {
    public static void main(String[] args) throws IOException{
        BufferedReader entradaCalc = new BufferedReader(new InputStreamReader(System.in));   
        
        System.out.println("Operacion que desea hacer:");
        String conversionInput = entradaCalc.readLine();//input del usuario

        if (conversionInput != null){
        LinkedList<Character> listaInput = new LinkedList<>();//creamos la lista en donde queremos almacenar el input

        for(int i=0; i< conversionInput.length(); i++){
                char actual = conversionInput.charAt(i);
                listaInput.insert(actual);
            }
        Conversion conv = new Conversion();
        conv.conversorAExpresionPOSTFIJA(listaInput);//le damos el metodo de conversion la lista que tenemos
        }

      
}
}

