/**
 * Clase abstracta que implementa listas y define estos metodos para las listas
 * @author: Oscar Juarez - 17315
 * @author: Paul Belches - 17088
 * @version: 16/02/18
 * Algoritmos y Estructura de Datos - seccion: 10
 */

package hojadetrabajo4;

public abstract class AbstractList<E>
       implements List<E>
{
   public AbstractList()
   // post: does nothing
   {
   }
    
    /**
     * Metodo para agregar un elemento al stack .
     * @param item el elemento que se va a agregar
     * PRE: El elemento existe
     * POST: El elemento es agregado
     */
   @Override
    public void push(E item){
   // pre: the element exists
   // post: item is added to stack
   // will be popped next if no intervening push
        addLast(item);
    }
    
    /**
     * Método para obtener el ultimo elemento guardado
     * @return el elemento
     * PRE: La pila no esta vaica
     * POST: El elemento se elimina y se devuelves
     */
   @Override
    public E pop(){
   // pre: stack is not empty
   // post: most recently pushed item is removed and returned
        return removeLast();
    }
    
    /**
     * Metodo para ver cual fue el ultimo objeto que se guardo
     * @return el ultimo objjeto que se guardo
     * PRE: La pila no esta vacia
     * POST: El ultimo valor es devuelto
     */
   @Override
    public E peek(){
   // pre: stack is not empty
   // post: top value (next to be popped) is returned
        return getLast();
    }
    
    /**
     * Metodo para revisar si el stack eta vacio
     * @return tru/false dependiendo de si esta vacio o no
     * POST: verdadero si la lista esta vacia
     */
   @Override
    public boolean empty(){
   // post: returns true if and only if the stack is empty
        return size() == 0;
    }
    
    /**
     * Metodo para obtner el numero de elementos guardados
     * @return el numero de elementos guardados
     * POST: El numero de elementos guardados
     */
   @Override
    public int size(){
   // post: returns the number of elements in the stack
        return 0;
    }

}