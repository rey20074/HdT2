/*
José Mariano Reyes Hernández 20074
Última modificación: 04/02/2021

Main del programa que implementará la calculadora con la interfaz prevista

*/

import java.io.File;
import java.util.Scanner;

public class MainJMR{
    public static void main(String[]args){

        String operacion = "";

        try{

            Scanner arch = new Scanner(new File("datos.txt"));

            //revisa si existen mas lineas dentro del texto.
            while (arch.hasNextLine()){
                operacion += arch.nextLine();
            }

            arch.close();

        }catch (Exception ex){
            ex.printStackTrace();

        }

        //array de los datos del archivo de texto
        String [] op = operacion.split(" ");

        //creacion de las intancias de calcula y vector
        String calc = "";
        int resultado = 0;
        StackVector<Integer> calculo = new StackVector<Integer>();
        Calculadora calcu = new Calculadora();

        //se revisa si es entero o no
        for (String ope : op) {

            if(Character.isDigit(ope.charAt(0))){
                // se inserta hasta el final del StackVector
                calculo.push(Integer.parseInt(ope)); 
            }

            else{ //si no es numero automaticamente lo considera como un operador

                int x = calculo.pop();
                int y = calculo.pop();

                //se guarda el orden necesitado
                calc = x+","+ope+","+y; 

                System.out.println("\nEstado Actual: "+x+" "+ope+" "+y);

                //realiza los calculos predispuestos
                resultado = Integer.parseInt(calcu.Calculo(calc)); 
                calculo.push(resultado); 
            }

            if(calculo.empty()){
                break;
            }
        }

        System.out.println("\nResultado : "+calculo.peek());
        
    }
}