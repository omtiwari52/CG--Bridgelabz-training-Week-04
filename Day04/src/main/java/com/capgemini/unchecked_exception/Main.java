package com.capgemini.unchecked_exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {

        //use try and catch to handle exception which may come during the execution
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){

            //get input from user
            System.out.print("Enter first number: ");
            int a = Integer.parseInt(br.readLine());
            System.out.print("Enter second number: ");
            int b = Integer.parseInt(br.readLine());

            System.out.print("Your result of division is: "+DivideNumbersAndHandleException.divideTwoNumbers(a,b));
        }catch (IOException e){ //handles IO exception
            System.out.println("Exception caught IOException: "+ e.getMessage());
        }catch (ArithmeticException e){ //handles Arithmetic exception
            System.out.println("Exception caught ArithmeticException : "+ e.getMessage());
        }catch (InputMismatchException e){ //this exception will never come because we are using bufferReader and it comes in scanner
            System.out.println("Exception caught InputMismatchException: "+ e.getMessage());
        }
    }
}
