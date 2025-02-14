package com.capgemini.exception_propagation_in_methods;

public class ExceptionPropagation {
    public int num;
    ExceptionPropagation(int num){
        this.num=num;
    }
    public void method1(){
        int result=num/0;
    }
    public void method2(){
        method1();
    }
}
