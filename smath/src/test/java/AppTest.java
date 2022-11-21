package smath.src.test.java.iclyn;

import org.junit.Assert.*;

import smath.src.main.java.iclyn.App;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void math()
    {
        assertEquals(App.math(1, 1, 1), 3);
    }
}
