package com.ds.fp.experiments;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class BiFunctionCalculatorTest {
    @Test
    public void testCalc() {
        BiFunctionCalculator calculator = new BiFunctionCalculator();
        assertEquals(calculator.result.value, 0);

        calculator.calc(calculator.add, 5);
        assertEquals(calculator.getValue(), 5);

        calculator.calc(calculator.add, 5);
        assertEquals(calculator.getValue(), 10);

        calculator.calc(calculator.add, -5);
        assertEquals(calculator.getValue(), 5);
    }
}
