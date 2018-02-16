/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hojadetrabajo4;

/**
 *
 * @author paulb
 */
public class StackFactory {
    
    public static Stack usarFactory(String criteria)
        {
          if ( criteria.equals("double") )
            return new DoubleLinkedList();
          else if ( criteria.equals("single") )
            return new SinglyLinkedList();
          else if ( criteria.equals("circular") )
            return new CircularList();
          else if ( criteria.equals("vector") )
            return new StackVector();
          else if ( criteria.equals("array") )
            return new StackArrayList();        
          return null;
        } 
    
}
