/**
 * Clase que implementa los metodos para la lista circular
 * @author: Oscar Juarez - 17315
 * @author: Paul Belches - 17088
 * @version: 16/02/18
 * Algoritmos y Estructura de Datos - seccion: 10
 */

package hojadetrabajo4;

public class CircularList<E> extends AbstractList<E> {

protected Node<E> tail; 
protected int count;

public CircularList()
// pre: constructs a new circular list
{
   tail = null;
   count = 0;
}

/**
 * Agrega un elemento al inicio de la lista
 * @param value: El valor que se desea agregar
 */
public void addFirst(E value)
// pre: value non-null
// post: adds element to head of list
{
   Node<E> temp = new Node<E>(value);
   if (tail == null) { // first value added
       tail = temp;
       tail.setNext(tail);
   } else { // element exists in list
       temp.setNext(tail.next());
       tail.setNext(temp);
   }
   count++;
}

/**
 * Agrega un valor al final de la lista.
 * @param value: El valor a agregar.
 * pre: value non-null
 * post: adds element to tail of list
 */
public void addLast(E value)
{
   // new entry:
   addFirst(value);
   tail = tail.next();  
}

/**
 * Elimina el ultimo elemento de la lista.
 * @return: El ultimo elemento de la lista.
 * pre: !isEmpty()
 * post: returns and removes value from tail of list
 */
public E removeLast()
{
   Node<E> finger = tail;
   while (finger.next() != tail) {
       finger = finger.next();
   }
   // finger now points to second-to-last value
   Node<E> temp = tail;
   if (finger == tail)
   {
       tail = null;
   } else {
       finger.setNext(tail.next());
       tail = finger;
   }
   count--;
   return temp.value();
}

    @Override
    /**
     * Retorna el tamano de la lista.
     * POST: El numero de elemento en la lista
     */
    public int size() {
        return count;
    }

    @Override
    /**
     * elimina los elementos dentro de la lista
     * POST: Vacia la lista
     */
    public void clear() {
        tail = null;
        count = 0;
    }

    @Override
    /**
     * Retrona el ultimo elemento de la lista
     * PRE: Que la lista no este vacia
     * POST: El ultima elemento de la lista
     */
    public E getLast() {
        return tail.value();
    }
}