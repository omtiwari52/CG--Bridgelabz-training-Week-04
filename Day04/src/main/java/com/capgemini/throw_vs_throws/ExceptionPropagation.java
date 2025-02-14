package com.capgemini.throw_vs_throws;

public class ExceptionPropagation {
    public static double calculateInterest(double amount,double rate,double time) throws IllegalArgumentException{
        if( amount <0 || time <0){
            throw new IllegalArgumentException("Invalid input: Amount and rate must be positive");
        }
        return (amount *rate *time)/100;
    }
}
