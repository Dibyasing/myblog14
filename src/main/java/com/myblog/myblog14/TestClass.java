package com.myblog.myblog14;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestClass {

    public static void main(String[]args){
        List<Integer> val = Arrays.asList(22, 13, 21, 54, 67, 54, 6, 7, 332, 554, 34, 5);
        List<Integer> collect = val.stream().sorted().collect(Collectors.toList());
        System.out.println(collect);
        System.out.println("Hello");
    }
    }



