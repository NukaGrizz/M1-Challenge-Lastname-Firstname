package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConverterSwitchTest {

    Converter converterSwitch;

    @Before
    public void setUp() {
        converterSwitch = new ConverterSwitch();
    }

    @Test
    public void convertMonth() {

        assertEquals("January", converterSwitch.convertMonth(1));
        assertEquals("February", converterSwitch.convertMonth(2));
        assertEquals("March", converterSwitch.convertMonth(3));
        assertEquals("April", converterSwitch.convertMonth(4));
        assertEquals("May", converterSwitch.convertMonth(5));
        assertEquals("June", converterSwitch.convertMonth(6));
        assertEquals("July", converterSwitch.convertMonth(7));
        assertEquals("August", converterSwitch.convertMonth(8));
        assertEquals("September", converterSwitch.convertMonth(9));
        assertEquals("October", converterSwitch.convertMonth(10));
        assertEquals("November", converterSwitch.convertMonth(11));
        assertEquals("December", converterSwitch.convertMonth(12));
        assertEquals("Integer must be between 1 - 12.", converterSwitch.convertMonth(20));
    }




    @Test
    public void convertDay() {
        assertEquals("Sunday", converterSwitch.convertDay(1));
        assertEquals("Monday", converterSwitch.convertDay(2));
        assertEquals("Tuesday", converterSwitch.convertDay(3));
        assertEquals("Wednesday", converterSwitch.convertDay(4));
        assertEquals("Thursday", converterSwitch.convertDay(5));
        assertEquals("Friday", converterSwitch.convertDay(6));
        assertEquals("Saturday", converterSwitch.convertDay(7));
        assertEquals("Integer must be between 1 - 7", converterSwitch.convertDay(8));
    }
}