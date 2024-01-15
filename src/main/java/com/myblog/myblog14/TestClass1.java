package com.myblog.myblog14;

import io.micrometer.common.KeyValues;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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

        //Consumer<Integer> result=number-> System.out.println(number);
        //result.accept(100);

        //List<Integer> data = Arrays.asList(10, 30, 60, 34, 22, 89, 90);
        //List<Integer> newData = data.stream().sorted().collect(Collectors.toList());
        //System.out.println(newData);

        //List<String> data1 = Arrays.asList("mike", "chandan", "kundan", "maxwell");
        //List<String> newString = data1.stream().filter(s -> s.startsWith("m")).collect(Collectors.toList());
        //List<String> newString1 = data1.stream().filter(s -> s.equals("maxwell")).collect(Collectors.toList());
        //List<String> newString2 = data1.stream().filter(s -> s.endsWith("n")).collect(Collectors.toList());
        //System.out.println(newString);
        //System.out.println(newString1);
        //System.out.println(newString2);

        //Predicate<Integer> val = y->y%2==0;
        //boolean result = val.test(10);
        //System.out.println(result);

        //Predicate<Integer>val1= x->x%2==0;
        //boolean result1 = val1.test(20);
        //System.out.println(result1);

        //Predicate<Integer> data2 =z->z%2!=0;
        //boolean test = data2.test(20);
        //System.out.println(test);

        //Predicate<String> val=str->str.equals("mike");
        //boolean result = val.test("mike");
        //System.out.println(result);

        //List<Integer> data = Arrays.asList(10, 30, 21, 45, 66, 87, 87);
        //List<Integer> newData = data.stream().map(i -> i + 2).collect(Collectors.toList());
        //System.out.println(newData);

        //Function<Integer,Integer> val=i->i+10;
        //Integer result = val.apply(10);
        //System.out.println(result);

        //List<Integer> data = Arrays.asList(10, 32, 45, 65, 78, 76, 7, 2);
        //List<Integer> NewData = data.stream().map(i -> i + 10).collect(Collectors.toList());
        //System.out.println(NewData);

        //List<String> data1 = Arrays.asList("mike", "chandan", "lisa", "dibya", "varsha");
        //List<String> NewData1 = data1.stream().filter(s->s.startsWith("l")).collect(Collectors.toList());
        //System.out.println(NewData1);

        //Supplier<Integer> x=()->new Random().nextInt(10000);
        //Integer y=x.get();
        //System.out.println(y);

        List<Login> logins=Arrays.asList(
                new Login("mike","Dibya@123"),
                new Login("stallin","testing"),
                new Login("Pankaj","PSA")
        );
        List<LoginDto>dtos=logins.stream().map(login->mapToDto(login)).collect(Collectors.toList());
        System.out.println(dtos);
    }
    static LoginDto mapToDto(Login login){
        LoginDto dto=new LoginDto();
        dto.setUserName(login.getUserName());
        dto.setPassword(login.getPassword());
        return dto;
    }
}
//stream API