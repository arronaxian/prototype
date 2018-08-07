package com.ds.fp.experiments;

import java.util.function.BiConsumer;

public class Main {
    public static void main(String ... args) {
        testBiConsumer();
    }

    public static void testBiConsumer() {
        // Side effects
        final Result result = new Result();

        BiConsumer<Integer, Integer> biConsumer1 = (a,b) -> {
            System.out.println("1:" + a + ", " + b);
            result.value += a + b;
        };

        BiConsumer<Integer, Integer> biConsumer2 = (a,b) -> {
            System.out.println("2:" + a + ", " + b);

            result.value += a * b;
        };

        biConsumer1.andThen(biConsumer2).accept(2,2);

        System.out.println(result.value);
    }


}
