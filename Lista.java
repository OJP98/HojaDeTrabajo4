/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea.algoritmos.pkg2;

/**
 *
 * @author paulb
 */
public abstract class Lista<E> {
    private int count;
    public Lista(){
        count = 0;
    }
    public abstract E removeLast();
   // pre: list is not empty
   // post: removes last value from list
 
    public abstract E getLast();
   // pre: list is not empty
   // post: returns last value in list
            
    public void add(E value){
   // post: value is added to tail of list
    }
    public int size(){
   // post: returns number of elements in list
        return count;
    }

   public boolean isEmpty(){
   // post: returns true iff list has no elements
        return count == 0;
   }

}