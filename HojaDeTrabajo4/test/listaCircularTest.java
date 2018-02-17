import hojadetrabajo4.CircularList;
import hojadetrabajo4.List;
import org.junit.Test;
import static org.junit.Assert.*;

public class listaCircularTest {
    
    public listaCircularTest() {
        
        listaC.addLast(1);
        listaC.addLast(2);
        listaC.addLast(3);
        listaC.addLast(4);        
        
    }
    List listaC = new CircularList();    
    
    @Test
    public void addLastSizeTest(){                
        
        listaC.addLast(5);
        
        int respuesta = listaC.size();
        
        assertEquals(5,respuesta);
    }
    
    @Test
    public void removeLastSizeTest(){
        
        listaC.removeLast();
        
        int respuesta = listaC.size();
        
        assertEquals(3,respuesta);
        
    }
    
    @Test
    public void clearTest(){
        
        listaC.clear();
        
        int respuesta = listaC.size();
        
        assertEquals(0,respuesta);        
        
    }
    
    
    @Test
    public void getLastTest(){
        
        int respuesta = (int)listaC.getLast();
        
        assertEquals(4,respuesta);
    }
}
