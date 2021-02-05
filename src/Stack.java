/*
José Mariano Reyes Hernández 20074
Última modificación: 04/02/2021

Interfaz del Stack donde se crean los métodos del stack predeterminados

*/

public interface Stack<E> {
    
    //comprueba si se encuentra vacio o con algo dentro
    public boolean empty();

    //regresa el tamaño 
    public int size();

    //regresa el valor de hasta el final
    public E pop();

    //adiciona el numero al final del stack
    public void push(E num);

    //regresa el primer valor del stack
    public E peek();
}
