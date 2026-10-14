package com.student;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{

    @Test(expected = ArithmeticException.class)
    public void shouldAnswerWithTrue()
    {
        Calculator c = new Calculator();
        c.divide(10, 2);
    }
}
