import hojadetrabajo4.*;
import hojadetrabajo4.SinglyLinkedList;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Usuario
 */
public class listaSimpleTest {
    
    List a = new SinglyLinkedList();
    
    @Test
    public void AddGetTest(){
        
        int resultado = 14;
        
        a.addLast(12);                       
        a.addLast(13);                       
        a.addLast(resultado);                       
        
        int respuesta = (int) a.getLast();
        
        assertEquals(resultado, respuesta, 0);
    }
    
    @Test
    public void sizeRemoveTest(){
    
        a.addLast(1);
        a.addLast(2);
        a.addLast(3);
        a.addLast(4);
        a.addLast(5);
        
        a.removeLast();
        
        int resultado = a.size();    
        
        assertEquals(4, resultado, 0);        
    }
    
    @Test
    public void clearTest(){
        
        a.addLast(1);
        a.addLast(2);
        a.addLast(3);
        a.addLast(4);
        a.addLast(5);
        
        a.clear();
        
        int resultado = a.size();    
        assertEquals(resultado, 0, 0);        
    }
    
    
    
    
}
