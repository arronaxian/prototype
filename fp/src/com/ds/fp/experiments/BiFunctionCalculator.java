package com.ds.fp.experiments;

import java.util.function.BiFunction;

class BiFunctionCalculator {
    Result result = new Result();

    public static final BiFunction<Integer, Integer, Result> add = (a,b) -> {
        Result result = new Result();

        result.value = a + b;

        return result;
    };

    public void calc(BiFunction<Integer, Integer, Result> op, int value) {
        result.value = op.apply(result.value, value).value;
    }

    public int getValue() {
        return result.value;
    }
}