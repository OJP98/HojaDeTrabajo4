/**
 * Interfaz que define los metodos para las listas
 * @author: Oscar Juarez - 17315
 * @author: Paul Belches - 17088
 * @version: 16/02/18
 * Algoritmos y Estructura de Datos - seccion: 10
 */

package hojadetrabajo4;

public interface List<E> extends Stack<E>
{
   public int size();
   // post: returns number of elements in list

   public void clear();
   // post: empties list

   public void addLast(E value);
   // post: value is added to end of list

   public E getLast();
   // pre: list is not empty
   // post: returns last value in list

   public E removeLast();
   // pre: list is not empty
   // post: removes last value from list

/*

   public E get();
   // pre: list has at least one element
   // post: returns last value found in list

   public boolean contains(E value);
   // pre: value is not null
   // post: returns true iff list contains an object equal to value

   public int indexOf(E value);
   // pre: value is not null
   // post: returns (0-origin) index of value,
   // or -1 if value is not found

   public int lastIndexOf(E value);
   // pre: value is not null
   // post: returns (0-origin) index of value,
   // or -1 if value is not found

   public E get(int i);
   // pre: 0 <= i < size()
   // post: returns object found at that location

   public E set(int i, E o);
   // pre: 0 <= i < size()
   // post: sets ith entry of list to value o;
   // returns old value

   public void add(int i, E o);
   // pre: 0 <= i <= size()
   // post: adds ith entry of list to value o

   public E remove(int i);
   // pre: 0 <= i < size()
   // post: removes and returns object found at that location
*/
}