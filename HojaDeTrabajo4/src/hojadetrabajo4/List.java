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
    /**
     * Devuelve el tamano de la lista
     * @return: El tamano de la lista
     * post: returns number of elements in list
     */
   public int size();   

   /**
    * Elimina todos los elemento de la lista
    * post: empties list
    */
   public void clear();   

   /**
    * Agrega un elemento al final de las listas
    * @param value: El valor a agregar
    * post: value is added to end of list
    */
   public void addLast(E value);

   /**
    * Regresa el ultimo elemento de la lista
    * @return: El ultimo elemento de la lista
    * pre: list is not empty
    * post: returns last value in list
    */
   public E getLast();

   /**
    * Eliimina el ultimo elemento de la lista
    * @return: El ultimo elemento de la lista
    * pre: list is not empty
    * post: removes last value from list
    */
   public E removeLast();

}