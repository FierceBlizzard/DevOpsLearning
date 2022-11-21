package smath.src.test;

import org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import java.beans.Transient;
import org.junit.Test;
import App;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void math(){
        assertEquals(App.math(1, 1, 1), 3);
    }
}
public class TryingTest{
    @Test
    public void mathTest(){
        assertEquals(App.math(1,1,1), 3);
    }
}
