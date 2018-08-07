package com.ds.fp.experiments;

import java.util.function.Supplier;

public class ResultSupplier {

    Supplier<Result> newResult = () -> {
        return new Result();
    };

    Supplier<Result> randomResult = () -> {
        return new Result();
    };
}
