/**
 * Clase que implementa los metodos para las listas simplemente encadenadas
 * @author: Oscar Juarez - 17315
 * @author: Paul Belches - 17088
 * @version: 16/02/18
 * Algoritmos y Estructura de Datos - seccion: 10
 */

package hojadetrabajo4;

public class SinglyLinkedList<E> extends AbstractList<E>
{

   protected int count; // list size
   protected Node<E> head; // ref. to first element

   public SinglyLinkedList()
   // post: generates an empty list
   {
      head = null;
      count = 0;
   }
   
   /**
    * Metodo que devuelve el tamano de la lista
    * @return: El tamano de la lista
    * POST: Retrona el numero de elementos en la lista
    */
   public int size()
   // post: returns number of elements in list
  {
    return count;
  }
   
   /**
    * Agrega un elemento al final de la lista
    * @param value: El valor a agregar
    * POST: Agrega el valor al final de la lista
    */
  public void addLast(E value)
  // post: adds value to end of list
  {
      // location for new value
      Node<E> temp = new Node<E>(value,null);
      if (head != null)
     {
         // pointer to possible tail
         Node<E> finger = head;
         while (finger.next() != null)
         {
                finger = finger.next();
         }
		 
         finger.setNext(temp);
      } else head = temp;
	  
	  count++;
	  
   }
   
  /**
   * Vacia la lista
   * POST: Elimna todos los elementos de la lista
   */
    @Override
    public void clear() {
        head = null;
        count = 0;
    }

    /**
     * Devuelve el ultimo valor de la lista.
     * @return: El valor
     * POST: Devuelve el ultimo valor agregado
     */
    @Override
    public E getLast() {
        Node node = head;
        while (node.next() != null){
            node = node.next();
        }
        return (E)node.data;
    }

    /**
     * Elimina y devuelve el ultimo valor de la lista
     * @return: El valor
     * POST: Elimina y devuelve el ultimo valor agregado a la lista
     */
    @Override
    public E removeLast() {
        Node node = head;
        Node temp = node;
        while (node.next() != null){
            temp = node;
            node = node.next();
        }
        temp.nextElement = null;
        count--;
        return (E)node.data;
    }


}