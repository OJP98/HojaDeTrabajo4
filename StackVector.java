package tarea.algoritmos.pkg2;
import java.util.Vector;
/**
 * @author Paul Belches
 * @author Mario Sarmientos 
 * @param <E> 
 * @since 30/01/18
 */
public class StackVector<E> implements Stack<E>{
    
    protected Vector<E> data;

    /**
     *Constructor de la clase
     * POST: Construye un nuevo Stack, vacio
     */
    public StackVector(){
        data = new Vector<E>();
    }

    /**Metodo para ingresar un valor dentro del stack
     *POST: Agrega un valor al final del Stack
     * @param item que se va a ingresar
     */
    public void push(E item){
        data.addElement(item);
    }
    
    /**Metodo para obtener un valor del stack
     *PRE: Stack no vacio
     *POST: Se saca el ultimo elemento que se agrego
     * @return el valor que esta en la parte de arriba del stack
     */
    public E pop()
            // pre: stack is not empty
            // post: most recently pushed item is removed and returned
    {
        return (E)data.remove(size()-1);
    }
    
    /**Metodo para obtener el ultimo valor guardado denntro del stack
     **PRE: Stack no vacio
     *POST: Se muestra el ultimo elemento que se agrego
     * @return ultimo valor guardado denntro del stack
     */
    public E peek()
            // pre: stack is not empty
            // post: top value (next to be popped) is returned
    {
        return (E)data.get(size() - 1);
    }
    
    /**Metodo para ver la cantidad de elementos guardados en el stack
     *POST: Se devueleve el tamaño del stack
     * @return el numero de valores guardados en el stack
     */
    public int size()
            // post: returns the number of elements in the stack
    {
        return data.size();
    }
    
    /**Metodo para ver si el stack esta vacio
     * POST: Se devuelve si esta vacio o no, true false respectivamente.
     * @return true/false dependeiendo de si el stack esta vacio o no
     */
    public boolean empty()
            // post: returns true if and only if the stack is empty
    {
        return size() == 0;
    }
}
