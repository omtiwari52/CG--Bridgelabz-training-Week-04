package com.capgemini.throw_vs_throws;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {

        //use try and catch to handle exception which may come during the execution
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){

            //get user input
            System.out.print("Enter your amount: ");
            double amount = Integer.parseInt(br.readLine());
            System.out.print("Enter your rate: ");
            double rate = Integer.parseInt(br.readLine());
            System.out.print("Enter your time: ");
            double time = Integer.parseInt(br.readLine());

            //invoke method and print result
            System.out.println("calculated amount : "+ExceptionPropagation.calculateInterest(amount, rate, time));
        }catch(IllegalArgumentException e){ //catches illegal argument exception
            System.out.println("Exception caught "+e.getMessage());
        }catch (IOException e){ //catches IO exception
            System.out.println("Exception Caught "+ e.getMessage());
        }
    }
}
