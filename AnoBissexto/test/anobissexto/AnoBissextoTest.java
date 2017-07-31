package anobissexto;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Tat
 */
public class AnoBissextoTest {
    
  AnoBissexto teste = new AnoBissexto();
  
       @Test
    public void testClasseValida1() {
        assertTrue(teste.AnoBissexto(4));
    }

    @Test
    public void testClasseValida2() {
        assertTrue(teste.AnoBissexto(1600));
    }
    
    @Test
    public void testClasseValida3() {
        assertTrue(teste.AnoBissexto(0));
    }
    
     @Test
    public void testClasseValida4() {
        assertFalse(teste.AnoBissexto(5));
    }
    
     @Test
    public void testClasseValida5() {
        assertFalse(teste.AnoBissexto(1500));
    }
    
}
