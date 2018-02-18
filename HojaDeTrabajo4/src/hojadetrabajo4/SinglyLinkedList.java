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
   
   public int size()
   // post: returns number of elements in list
  {
    return count;
  }
  /*
  public void addFirst(E value)
  // post: value is added to beginning of list
  {
     // note order that things happen:
     // head is parameter, then assigned
     head = new Node<E>(value, head);
     count++;
  }
  
  public E removeFirst()
  // pre: list is not empty
  // post: removes and returns value from beginning of list
 {
     Node<E> temp = head;
     head = head.next(); // move head down list
     count--;
     return temp.value();
  }
  
  public E getFirst()
  // pre: list is not empty
  // post: returns first value in list
  {
      return head.value();
  }
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
   
   /*
   public boolean contains(E value)
   // pre: value is not null
   // post: returns true iff value is found in list
  {
      Node<E> finger = head;
	  
      while (finger != null &&
             !finger.value().equals(value))
     {
          finger = finger.next();
      }
      return finger != null;
   }
*/
   
    @Override
    public void clear() {
        head = null;
        count = 0;
    }

    @Override
    public E getLast() {
        Node node = head;
        while (node.next() != null){
            node = node.next();
        }
        return (E)node.data;
    }

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