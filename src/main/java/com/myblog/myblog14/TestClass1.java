package com.myblog.myblog14;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
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

        //List<String> data1 = Arrays.asList("mike", "chandan", "kundan", "maxwell");
        //List<String> newString = data1.stream().filter(s -> s.startsWith("m")).collect(Collectors.toList());
        //System.out.println(newString);

        //List<Integer> list = Arrays.asList(10, 23, 21, 45, 65, 33, 76, 85);
        //List<Integer> collect = list.stream().filter(i -> i % 2 == 0).map(i -> i * i).collect(Collectors.toList());
        //System.out.println(collect);

        //List<Integer> list1 = Arrays.asList(1, 4, 2, 7, 4, 5, 6, 5);
        //List<Integer> collect1 = list1.stream().filter(odd -> odd % 2 != 0).map(odd -> odd * odd).collect(Collectors.toList());
        //System.out.println(collect1);

        //List<String> list2 = Arrays.asList("Asish", "Lodu", "Ram", "Suresh", "Samarth");
        //List<String> result = list2.stream().filter(s -> s.startsWith("R")).map(s -> s.toUpperCase()).collect(Collectors.toList());
        //System.out.println(result);

        //List<Employee> employees = Arrays.asList(
                //new Employee("Dibya", 20, "Male"),
                //new Employee("Lisa", 34, "Female"),
                //new Employee("Varsha", 33, "Female"),
                //new Employee("Tulu", 32, "Male")
        //);
        //Map<Integer, List<Employee>> val = employees.stream().collect(Collectors.groupingBy(e -> e.getAge()));
        //System.out.println(val);

        //List<Integer> var = Arrays.asList(10, 32, 5, 3, 2, 45, 65, 43, 21);
        //List<Integer> collect = var.stream().filter(i -> i>=50).map(i -> i * i).collect(Collectors.toList());
        //System.out.println(collect);

        //List<Employee> list = Arrays.asList(
                //new Employee("Ram",32,"Banglore"),
                //new Employee("Swayam",21,"Cuttack"),
                //new Employee("Kundan",22,"Bhubaneswar")
       // );
        //Map<Integer, List<Employee>> collect1 = list.stream().collect(Collectors.groupingBy(e -> e.getAge()));
        //for ( Map.Entry<Integer, List<Employee>> entry:collect1.entrySet()){
            //int age = entry.getKey();
           // List<Employee> employeesWithAge = entry.getValue();
            //System.out.println("age:"+age+"---");
            //for(Employee e:employeesWithAge){
                //System.out.println(e.getCity());
                //System.out.println(e.getName());
           // }
       // }

        List<Employee> list = Arrays.asList(
                new Employee("Swadesh", 21, "Kendrapara"),
                new Employee("Swetapallabita", 34, "Cuttack"),
                new Employee("Mina ma", 35, "Bhubaneswar")
        );
        Map<Integer, List<Employee>> collect = list.stream().collect(Collectors.groupingBy(e -> e.getAge()));
        for (Map.Entry<Integer, List<Employee>>entry:collect.entrySet()){
            int age = entry.getKey();
            List<Employee> value = entry.getValue();
            System.out.println(value);
            for (Employee v:value){
                System.out.println(v.getName());
                System.out.println(v.getCity());
            }
        }
    }


}
//stream API