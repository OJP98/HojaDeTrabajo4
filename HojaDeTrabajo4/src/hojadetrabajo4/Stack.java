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
    
    /**Metodo para agregar un elemento al stack 
     *
     * @param item el elemento que se va a agregar
     */
    public void push(E item);
   // pre: 
   // post: item is added to stack
   // will be popped next if no intervening push
   
    /**Método para obtener el ultimo elemento guardado
     *
     * @return el elemento
     */
    public E pop();
   // pre: stack is not empty
   // post: most recently pushed item is removed and returned
   
    /**Metodo para ver cual fue el ultimo objeto que se guardo
     *
     * @return el ultimo objjeto que se guardo
     */
    public E peek();
   // pre: stack is not empty
   // post: top value (next to be popped) is returned
   
    /**Metodo para revisar si el stack eta vacio
     *
     * @return tru/false dependiendo de si esta vacio o no
     */
    public boolean empty();
   // post: returns true if and only if the stack is empty
   
    /**Metodo para obtner el numero de elementos guardados
     *
     * @return el numero de elementos guardados
     */
    public int size();
   // post: returns the number of elements in the stack

}