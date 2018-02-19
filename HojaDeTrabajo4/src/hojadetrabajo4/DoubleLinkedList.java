/**
 * Clase que implementa los metodos para las listas doblemente encadenadas
 * @author: Oscar Juarez - 17315
 * @author: Paul Belches - 17088
 * @version: 16/02/18
 * Algoritmos y Estructura de Datos - seccion: 10
 */

package hojadetrabajo4;

public class DoubleLinkedList<E> extends AbstractList<E> {
protected int count;
protected DoublyLinkedNode<E> head;
protected DoublyLinkedNode<E> tail;

public DoubleLinkedList()
// post: constructs an empty list
{
   head = null;
   tail = null;
   count = 0;
}

/**
 * Agrega un elemnento al final de la lista
 * @param value: El elemento a agregar
 * pre: value is not null
 * post: adds new value to tail of list
 */
@Override
public void addLast(E value)
{
   // construct new element
   tail = new DoublyLinkedNode<E>(value, null, tail);
   // fix up head
   if (head == null) head = tail;
   count++;
}

/**
 * Remueve el ultimo elemento de la lista y lo elimina
 * @return: El ultimo elemento de la lista
 * pre: list is not empty
 * post: removes value from tail of list
 */
@Override
public E removeLast()
{
   DoublyLinkedNode<E> temp = tail;
   tail = tail.previous();
   if (tail == null) {
       head = null;
   } else {
       tail.setNext(null);
   }
   count--;
   return temp.value();
}

/**
 * Devuelve el tamano de la lista
 * @return: El tamano de la lista
 * POST: Devuelve el numero de elementos dentro de la lista
 */
@Override
public int size() {
    return count;
}

/**
 * Borra todos lo elementos dentro de la lista
 * POST: Vacia la lista entera
 */
@Override
public void clear() {
   head = null;
   tail = null;
   count = 0;
    
}

/**
 * Devuelve el ultimo elemento de la lista
 * @return: El ultimo elemento en la lista
 * PRE: Que la lista no este vacia
 * POST: Devuelve el ultimo valor de la lista
 */
@Override
public E getLast() {
    return tail.value();
}
}