/*
José Mariano Reyes Hernández 20074
Última modificación: 04/02/2021

calculadora del programa que implementará la calculadora con la interfaz prevista

*/

public class Calculadora implements CalculadoraGeneral{
    //revisa el tipo de operador y realiza la operacion indicada, regresando como string el resultado

    public String Calculo(String expresion){

        int res = 0;

        //separa el String recibido para poder utilizar las dos variables y el operador.
        String[] operacion = expresion.split(",");
        int x = Integer.parseInt(operacion[0]);
        int y = Integer.parseInt(operacion[2]);

        //en la posicion 1 se encuentre el operador por lo que se define la operacion segun su valor.
        switch(operacion[1]){
            case "+":
                res = x + y;
                break;

            case "-":
                res = x - y;
                break;

            case "*":
                res = x * y;
                break;

            case "/":
                res = x / y;
                break;
        }
        return ""+res;
    }
}
