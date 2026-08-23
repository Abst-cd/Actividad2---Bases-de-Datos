public class Conversion {


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

    public int conversorPesoPila(char data){
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
