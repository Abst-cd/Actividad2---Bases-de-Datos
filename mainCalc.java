import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class mainCalc {
    public static void main(String[] args) throws IOException{
        BufferedReader entradaCalc = new BufferedReader(new InputStreamReader(System.in));   
        
        System.out.println("Operacion que desea hacer:");
        String conversionInput = entradaCalc.readLine();
Conversion conv = new Conversion();
conv.conversorAExpresionPOSTFIJA(conversionInput);
}
}
