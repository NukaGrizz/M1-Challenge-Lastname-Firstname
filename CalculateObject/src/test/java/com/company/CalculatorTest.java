package com.company;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    private static Calculator calculator = new Calculator();

    @Test
    public void shouldReturnTheSumOfTwoIntsOrDoubles(){
        assertEquals(2, calculator.add(1,1));
        assertEquals(5.7, calculator.add(3.4,2.3),.0001);
    }

    @Test
    public void shouldReturnTheDifferanceOfTwoIntsOrDoubles(){
        assertEquals(-27, calculator.subtract(23,52));
        assertEquals(5, calculator.subtract(5.5,0.5),.0001);
    }

    @Test
    public void shouldReturnTheProductOfTwoIntsOrDoubles(){
        assertEquals(68, calculator.multiply(32,2));
        assertEquals(29.48, calculator.multiply(6.7,4.4),.0001);
    }

    @Test
    public void shouldReturnTheQuotientOfTwoInsOrDoubles(){
        assertEquals(4, calculator.divide(12,3), .0001);
        assertEquals(1.7142, calculator.divide(12,7), .0001);
        assertEquals(4.909, calculator.divide(10.8,2.2),.0001);
    }

}