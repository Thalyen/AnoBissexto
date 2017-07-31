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

    
}
