
/**
 * Clase que define el patron de diseno Factory
 * @author: Oscar Juarez - 17315
 * @author: Paul Belches - 17088
 * @version: 16/02/18
 * Algoritmos y Estructura de Datos - seccion: 10
 */

package hojadetrabajo4;

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
