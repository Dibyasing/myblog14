package com.myblog.myblog14;

import io.micrometer.common.KeyValues;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class TestClass1 {
    public static  void main(String[] args) {
        //predicate function
        //List<Integer> numbers = Arrays.asList(10, 20, 15, 45, 46, 16);
        //Predicate<Integer> val =x->x%2==0;
        //boolean result= val.test(10);
        //System.out.println(result);

        //Predicate<String> val=str->str.equals("mike");
        //boolean result = val.test("Stallin");
        //System.out.println(result);

        //List<Integer> numbers = Arrays.asList(10, 2, 32, 4, 12, 33, 20);//use odd even numbers
        //List<Integer> evenNumbers = numbers.stream().filter(n -> n % 2 != 0).collect(Collectors.toList());
        //System.out.println(evenNumbers);

        //List<String> numbers = Arrays.asList("mike","dibya","rony","santosh","rony");//use odd even numbers
        //List<String> data = numbers.stream().filter(s->s.startsWith("m")).collect(Collectors.toList());
        //List<String> data1 = numbers.stream().filter(s->s.equals("rony")).collect(Collectors.toList());
        //List<String> data2 = numbers.stream().filter(s->s.endsWith("a")).collect(Collectors.toList());
        //System.out.println(data);
        //System.out.println(data1);
        //System.out.println(data2);

        //List<String> numbers = Arrays.asList("mike","dibya","rony","santosh","rony");

        //Function<String,Integer> result= str->str.length();
        //Integer val = result.apply("mike");
        //System.out.println(val);

        //Function<Integer,Integer> result=i->i+10;
        //Integer val=result.apply(30);
        //System.out.println(val);

        //List<Integer> data = Arrays.asList(10,30,60,90,2);
        //List<Integer> newNumber = data.stream().map(i -> i + 10 ).collect(Collectors.toList());
        //System.out.println(newNumber);

        //List<String>data= Arrays.asList("mike","dibya","stallin","rony");
        //List<String> newData = data.stream().map(i -> i.toUpperCase()).collect(Collectors.toList());
        //System.out.println(newData);

        //List<String> data = Arrays.asList("dibya", "umit", "omm", "lisa");
        //List<String> newData = data.stream().sorted().collect(Collectors.toList());
        //System.out.println(newData);

        //List<Integer> data = Arrays.asList(22, 54, 63, 1, 78, 9, 57);
        //List<Integer> newData = data.stream().sorted().collect(Collectors.toList());
        //System.out.println(newData);

        //List<Integer> data = Arrays.asList(12, 34, 54, 12, 44, 46, 44, 46, 1, 3, 4, 100, 200);
        //List<Integer> newData = data.stream().distinct().collect(Collectors.toList());
        //System.out.println(newData);

        Consumer<Integer> result=number-> System.out.println(number);
        result.accept(100);
    }
}
