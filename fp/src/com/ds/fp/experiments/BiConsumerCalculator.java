package com.ds.fp.experiments;

import java.util.function.BiConsumer;

public class BiConsumerCalculator {
    private final Result result = new Result();
    public final BiConsumer<Integer, Integer> add = (a,b) -> {
        result.value = a + b;
    };

    public final BiConsumer<Integer, Integer> subtract = (a,b) -> {
        result.value = a - b;
    };

    public final BiConsumer<Integer, Integer> multiply = (a,b) -> {
        result.value = a * b;
    };

    public final BiConsumer<Integer, Integer> exp = (a,b) -> {
        System.out.println(a + "  " + b);
        result.value = a ^ b;
    };

    public void calc(BiConsumer<Integer, Integer> op, int value) {
        op.accept(result.value, value);
    }

    public int getValue() {
        return result.value;
    }
}
