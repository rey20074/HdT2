/*
José Mariano Reyes Hernández 20074
Última modificación: 04/02/2021

Clase del Stack donde se realizan los diversos métodos derivados de la interfaz de Stack

*/

import java.util.*;

public class StackVector<E> implements Stack<E>{

    //creacion del vector
    public Vector<E> vec;

    //constructor del vector simple
    public StackVector(){
        vec = new Vector<E>();
    }

    //comprueba si se encuentra vacio o con algo dentro
    public boolean empty(){
        return vec.isEmpty();
    }

    //regresa el tamaño 
    public int size(){
        return vec.size();
    }

    //regresa el valor de hasta el final
    public E pop(){
        //sca el ultimo elemento
        E valor = vec.get(vec.indexOf(vec.lastElement()));
        vec.remove(valor);
        return valor;
    }

    //adiciona el numero al final del stack
    public void push(E num){
        vec.addElement(num);
    }

    //regresa el primer valor del stack
    public E peek(){
        return vec.get(vec.indexOf(vec.firstElement()));
    }
}
