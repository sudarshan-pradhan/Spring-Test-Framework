package com.sudarshan.app.business;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SomeBusinessImpl {
    
    public Integer calculateSum(Integer[] data) {
        return Stream.of(data).collect(Collectors.summingInt(x->x));
    }
}
