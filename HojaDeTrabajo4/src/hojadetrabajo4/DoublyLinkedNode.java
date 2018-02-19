/**
 * Clase que implementa los metodos para los nodos dobles, usados por las listas doblemente encadenadas.
 * @author: Oscar Juarez - 17315
 * @author: Paul Belches - 17088
 * @version: 16/02/18
 * Algoritmos y Estructura de Datos - seccion: 10
 */

package hojadetrabajo4;

public class DoublyLinkedNode<E> {
    
protected E data;
protected DoublyLinkedNode<E> nextElement;
protected DoublyLinkedNode<E> previousElement;

    public DoublyLinkedNode(E v, DoublyLinkedNode<E> next, DoublyLinkedNode<E> previous)
    {
        data = v;
        nextElement = next;
        if (nextElement != null)
            nextElement.previousElement = this;
        previousElement = previous;
        if (previousElement != null)
            previousElement.nextElement = this;
    }

    /**
     * Crea un nuevo nodo
     * @param v: El elemento a agregar
     * post: constructs a single element
     */
    public DoublyLinkedNode(E v)    
    {
        this(v,null,null);
    }
    
    /**
     * Retorna la referencia del proximo elemento en la lista
     * post: returns reference to next value in list
     * @return: El proximo elemento
     */
    public DoublyLinkedNode<E> next()   
   {
      return nextElement;
   }
    
    /**
     * Establece el elemento proximo
     * @param next: El elemento a establecer
     * post: sets reference to new next value
     */
    public void setNext(DoublyLinkedNode<E> next)   
   {
      nextElement = next;
   }

    /**
     * Devuelve el valor del elemento
     * @return: El valor del elemento.
     * post: returns value associated with this element
     */
   public E value()   
   {
      return data;
   }

   /**
    * Establece el valor del elemento
    * @param value: El valor a establecer
    * post: sets value associated with this element
    */
   public void setValue(E value)   
   {
      data = value;
   }
   
   /**
    * Establece el elemento previo
    * @param next: El elemento a establecer
    */
   public void setPrevious(DoublyLinkedNode<E> next)
   // post: sets reference to new next value
   {
      previousElement = next;
   }     public DoublyLinkedNode<E> previous()
   // post: returns reference to next value in list
   {
      return previousElement;
   }


    
}