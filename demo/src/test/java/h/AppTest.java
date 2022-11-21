package h;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import java.beans.Transient;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue(){
        assertTrue( true );
    }
    @Test
    public void testingMath(){
        assertEquals(App.math(1, 1, 1), 3);
    }
}
