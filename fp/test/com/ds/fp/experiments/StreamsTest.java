package com.ds.fp.experiments;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

public class StreamsTest {
    @Test
    public void testFibonacciStream() {
        List<Integer> results = Arrays.asList( 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 );
        StreamExperiments fibby = new StreamExperiments();

        final List<Integer> values = new ArrayList<>();
        fibby.fibonacciStream.limit(10).forEach(fib -> values.add(fib));

        assertEquals(results, values);
    }

    @Test
    public void testCounterStream() {
        List<Integer> results = Arrays.asList(0,1,2,3,4,5,6,7,8,9);

        final List<Integer> values = new ArrayList<>();
        StreamExperiments sc = new StreamExperiments();
        sc.counterStream.limit(10).forEach(count -> values.add(count));

        assertEquals(results, values);
    }
}
