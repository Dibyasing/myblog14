package com.myblog.myblog14;

public class TestClass {

    public static void main(String[]args){
        TestClass testClass=new TestClass();
        int val=testClass.test();
        System.out.println(val);
    }
    public int test(){
        int otp=SampleClass.test1();
        return otp;
    }
}
