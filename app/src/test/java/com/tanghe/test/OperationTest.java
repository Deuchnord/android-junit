package com.tanghe.test;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

/**
 * Created by tanghe on 14/10/16.
 */

public class OperationTest {

    @Test
    public void testAddition()
    {
        assertEquals(5, Operation.addition(2, 3), 0);
    }

    @Test
    public void testSoustraction()
    {
        assertEquals(-1, Operation.soustraction(2, 3), 0);
    }

    @Test
    public void testMultiplication()
    {
        assertEquals(6, Operation.multiplication(2, 3), 0);
    }

    @Test
    public void testDivision()
    {
        try {
            assertEquals(3, Operation.division(15, 5), 0);
        }

        catch(Operation.DivideByZeroException e) {
            fail();
        }
    }

    @Test(expected = Operation.DivideByZeroException.class)
    public void testDivisionByZero() throws Operation.DivideByZeroException
    {
        Operation.division(15, 0);
    }

}
