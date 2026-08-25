public class Conversion {
Stack<Character> listaOperadores = new Stack<>(); // DONDE SE ALMACENAN COSAS COMO + - /
LinkedList<Character> expresionPostfija = new LinkedList<>(); //RESPUESTA DEL ALGORITMO



public void conversorAExpresionPOSTFIJA(LinkedList<Character> expresion){
    Node<Character> nodoTemporal = expresion.getNodeHead();


while(nodoTemporal != null){
        char actual =nodoTemporal.getData();//se define un actual para saber en que "indice " vamos
        if (Character.isDigit(actual)){
            expresionPostfija.insert(actual);// si es numero, se inserta en la postfija
        } else if (actual ==')'){
            while(!listaOperadores.isEmpty() && listaOperadores.peek() != '('){
                Character operadorSacado = listaOperadores.pop();
                expresionPostfija.insert(operadorSacado);
            }
            if (!listaOperadores.isEmpty() && listaOperadores.peek() == '(') {

        listaOperadores.pop();
            }
        } else {
            if(listaOperadores.isEmpty()){
                listaOperadores.push(actual);//si no es numero, la pasamos a la lista de los operadores
            
         } else {

                while(!listaOperadores.isEmpty()){

                    int pesoOperadorEntrada = conversorPesoExpresion(actual);
                    int pesoOperadorTope = conversorPesoPila(listaOperadores.peek()); //se convierten los pesos a variables para
                    //comparacion

                    if(pesoOperadorEntrada > pesoOperadorTope){

                        listaOperadores.push(actual); //si el peso de entrada es mayor al tope, se 
                        //inserta a la lista de los operadores
                        break; 

                    } else {

                        Character operadorSacado = listaOperadores.pop();
                        expresionPostfija.insert(operadorSacado);//el char que se saco se elimina de la lista de operadores para
                        //que no aparezca
                    }
                }

             
                if(listaOperadores.isEmpty()){

                    listaOperadores.push(actual);

                }
            }
        }
        nodoTemporal = nodoTemporal.getNext();
    }
    

        while(!listaOperadores.isEmpty()){
            Character operadorSacado = listaOperadores.pop();
            expresionPostfija.insert(operadorSacado);        //se vuelve a intentar eliminar los operadores hasta que este vacia 
            //la lista y se insertan en la postfija
        }
    

    System.out.println("Expresion Postfija: " + expresionPostfija);


    }


    public int conversorPesoExpresion(char data){
        if (data == '^'){
            return 4;
        } else if (data == '*' || data == '/'){
            return 2;
        } else if (data == '+' || data == '-'){
            return 1;
        } else if (data == '('){
            return 5;
        } 
        return -1;
    }

    public  int conversorPesoPila(char data){
        if (data == '^'){
            return 3;
        } else if (data == '*' || data == '/'){
            return 2;
        } else if (data == '+' || data == '-'){
            return 1;
        } else if (data == '('){
            return 0;
        } 
        return -1;
    }

}


