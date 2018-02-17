

import hojadetrabajo4.Stack;
import hojadetrabajo4.StackVector;
import org.junit.Test;
import static org.junit.Assert.*;

public class vectorTest {
    
    Stack stack = new StackVector<>();
    
    public vectorTest() {
        
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        
    }
    
    @Test
    public void PushPeekTest(){
        
        stack.push(50);
        
        int resultado = (int) stack.peek();
        
        assertEquals(50,resultado);
        
    }
    
    @Test
    public void PopSizeTest(){
        
        stack.pop();
        
        int resultado = stack.size();
        
        assertEquals(4,resultado);
    }
    
    @Test public void empty(){
        
        boolean respuesta = stack.empty();
        
        assertEquals(false,respuesta);
        
    }   
    
}
