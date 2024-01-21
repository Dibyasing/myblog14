package com.myblog.myblog14;

public class SampleClass {
    public static int test1() {
        SampleClass sampleClass=new SampleClass();
        int otp=sampleClass.returnOtp();
        return otp;
    }
    public int returnOtp(){
        return 123456;
    }
}
