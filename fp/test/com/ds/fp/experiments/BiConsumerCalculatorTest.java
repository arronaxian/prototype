package com.ds.fp.experiments;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class BiConsumerCalculatorTest {
    @Test
    public void testCalculatorOps() {
        BiConsumerCalculator calculator = new BiConsumerCalculator();
        assertEquals(calculator.getValue(), 0);

        calculator.calc(calculator.add, 1);
        assertEquals(calculator.getValue(), 1);

        calculator.calc(calculator.add, 2);
        assertEquals(calculator.getValue(), 3);

        calculator.calc(calculator.subtract, 3);
        assertEquals(calculator.getValue(), 0);

        calculator.calc(calculator.add.andThen(calculator.exp),2);
        assertEquals(calculator.getValue(), 4);
    }
}
