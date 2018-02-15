package hojadetrabajo4;

public abstract class AbstractList<E>
       implements List<E>
{
   public AbstractList()
   // post: does nothing
   {
   }
    
    /**Metodo para agregar un elemento al stack 
     *
     * @param item el elemento que se va a agregar
     */
   @Override
    public void push(E item){
   // pre: 
   // post: item is added to stack
   // will be popped next if no intervening push
        addLast(item);
    }
    /**Método para obtener el ultimo elemento guardado
     *
     * @return el elemento
     */
   @Override
    public E pop(){
   // pre: stack is not empty
   // post: most recently pushed item is removed and returned
        return getLast();
    }
    /**Metodo para ver cual fue el ultimo objeto que se guardo
     *
     * @return el ultimo objjeto que se guardo
     */
   @Override
    public E peek(){
   // pre: stack is not empty
   // post: top value (next to be popped) is returned
        return getLast();
    }
    /**Metodo para revisar si el stack eta vacio
     *
     * @return tru/false dependiendo de si esta vacio o no
     */
   @Override
    public boolean empty(){
   // post: returns true if and only if the stack is empty
        return size() == 0;
    }
    /**Metodo para obtner el numero de elementos guardados
     *
     * @return el numero de elementos guardados
     */
   @Override
    public int size(){
   // post: returns the number of elements in the stack
        return 0;
    }

//  public boolean contains(E value)
//  // pre: value is not null
//  // post: returns true iff list contains an object equal to value
//  {
//	return -1 != indexOf(value);
//  }
}