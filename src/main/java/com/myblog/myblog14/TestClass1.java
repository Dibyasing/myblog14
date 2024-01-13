package com.myblog.myblog14;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class TestClass1 {
    public static  void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 15, 45, 46, 16);
        Predicate<Integer> val =x->x%2==0;

    }
}
