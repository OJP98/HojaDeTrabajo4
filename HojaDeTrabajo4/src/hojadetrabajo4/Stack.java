/**
 * Clase que implementa los metodos para los stacks, usados por todas las implementaciones
 * @author: Oscar Juarez - 17315
 * @author: Paul Belches - 17088
 * @version: 16/02/18
 * Algoritmos y Estructura de Datos - seccion: 10
 */

package hojadetrabajo4;


/**
 *douglas.java 
 * Interfaz para Stacks
 * @author Paul Belches
 * @author Oscar Juarez
 * @since 19/02/18
 * @param <E> tipo de objeto que guardara el stack
 */
public interface Stack<E> 
{
    
    /** 
     * Metodo para agregar un elemento al stack
     * @param item el elemento que se va a agregar     
     * post: item is added to stack
     */
    public void push(E item);   
   // will be popped next if no intervening push
   
    /**
     * Método para obtener el ultimo elemento guardado
     * @return el elemento
     * pre: stack is not empty
     * post: most recently pushed item is removed and returned
     */
    public E pop();
   
    /**
     * Metodo para ver cual fue el ultimo objeto que se guardo
     * @return el ultimo objjeto que se guardo
     * pre: stack is not empty
     * post: top value (next to be popped) is returned
     */
    public E peek();   
   
    /** 
     * Metodo para revisar si el stack eta vacio
     * @return tru/false dependiendo de si esta vacio o no
     * post: returns true if and only if the stack is empty
     */
    public boolean empty();   
   
    /**
     * Metodo para obtner el numero de elementos guardados
     * @return el numero de elementos guardados
     * post: returns the number of elements in the stack
     */
    public int size();   

}