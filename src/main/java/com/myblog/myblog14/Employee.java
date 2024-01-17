package com.myblog.myblog14;

public class Employee {
    private String Name;
    private int Age;

    private String Gender;

    public Employee(String name, int age, String gender) {
        this.Name = name;
        this.Age = age;
        this.Gender = gender;
    }

    public String getName() {
        return Name;
    }

    public int getAge() {
        return Age;
    }

    public String getGender() {
        return Gender;
    }
}

