package com.ds.fp.experiments;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

public class FibonacciTest {
    @Test
    public void testFibonacciStream() {
        List<Integer> results = Arrays.asList( 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 );
        Fibonacci fibby = new Fibonacci();

        final List<Integer> fibResults = new ArrayList<>();
        fibby.fibonacciStream.limit(10).forEach(fib -> fibResults.add(fib));

        assertEquals(results, fibResults);
    }
}
