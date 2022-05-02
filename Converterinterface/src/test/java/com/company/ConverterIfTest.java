package com.company;

import org.junit.Before;
import org.junit.Test;

import java.util.Scanner;

import static org.junit.Assert.assertEquals;

public class ConverterIfTest {

    Converter converterIf;

    @Before
        public void setUp() {
        converterIf = new ConverterIf();
    }

    @Test
    public void convertMonth() {

        assertEquals("January", converterIf.convertMonth(1));
        assertEquals("January", converterIf.convertMonth(2));
        assertEquals("January", converterIf.convertMonth(3));
        assertEquals("January", converterIf.convertMonth(4));
        assertEquals("January", converterIf.convertMonth(5));
        assertEquals("January", converterIf.convertMonth(6));
        assertEquals("January", converterIf.convertMonth(7));
        assertEquals("January", converterIf.convertMonth(1));
        assertEquals("January", converterIf.convertMonth(1));
        assertEquals("January", converterIf.convertMonth(1));
        assertEquals("January", converterIf.convertMonth(1));
        assertEquals("January", converterIf.convertMonth(1));
    }




    @Test
    public void convertDay() {
    }
}