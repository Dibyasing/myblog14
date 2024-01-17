package com.myblog.myblog14;

public class Employee {
    private String Name;
    private int Age;

    private String City;

    public Employee(String name, int age, String city) {
        this.Name = name;
        this.Age = age;
        this.City = city;
    }

    public String getName() {
        return Name;
    }

    public int getAge() {
        return Age;
    }

    public String getCity() {
        return City;
    }
}

