/**
 * Clase que implementa los metodos la pila de arraylist.
 * @author: Oscar Juarez - 17315
 * @author: Paul Belches - 17088
 * @version: 16/02/18
 * Algoritmos y Estructura de Datos - seccion: 10
 */

package hojadetrabajo4;


import java.util.ArrayList;

public class StackArrayList<E>
 implements Stack<E>
{
	protected ArrayList<E> data;

	public StackArrayList()
	// post: constructs a new, empty stack
	{
		data = new ArrayList<E>();
	}

        /**
         * Agrega un elemento al array
         * @param item: El elemento a agregar
         * post: the value is added to the stack
         */
	public void push(E item)	
	//will be popped next if no intervening push
	{
		data.add(item);
	}

        /**
         * Elimina y devuelve el ultimo elemento de la lista
         * @return: El ultimo elemento de la lista
         * pre: stack is not empty
	 * post: most recently pushed item is removed and returned
         */
	public E pop()	
	{
		return data.remove(size()-1);
	}

        /**
         * Devuelve el ultimo elemento de la lista
         * @return: El ultimo elemento de la lista
         * pre: stack is not empty
	 * post: top value (next to be popped) is returned
         */
	public E peek()	
	{
		return data.get(size() - 1);
	}
	
        /**
         * Devuelve el tamano de la lista
         * @return: El tamano de la lista
         * post: returns the number of elements in the stack
         */
	public int size()	
	{
		return data.size();
	}
  
        /**
         * Devuelve si verdadero si la lista esta vacia o no
         * @return: El valor booleano
         * post: returns true if and only if the stack is empty
         */
	public boolean empty()	
	{
		return size() == 0;
	}
}