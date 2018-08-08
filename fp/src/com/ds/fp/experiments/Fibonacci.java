package com.ds.fp.experiments;

import java.util.function.Supplier;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Fibonacci {
    public IntStream fibonacciStream = Stream.iterate(
            new int[]{1, 1},
            fib -> new int[] {fib[1], fib[0] + fib[1]}
    ).mapToInt(fib -> fib[0]);
}
