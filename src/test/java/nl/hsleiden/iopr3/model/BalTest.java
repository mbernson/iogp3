package nl.hsleiden.iopr3.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class BalTest {

    @Test
    public void testAdjust() throws Exception {
        Bal b = new Bal();
        b.adjust(2000);

        assertEquals(19.62, b.getY(), 0.01);
    }

    @Test
    public void testReset() throws Exception {
        Bal bal = new Bal();
        bal.reset();
        assertEquals(10, bal.getX(), 0);
        assertEquals(0, bal.getY(), 0);
    }
}