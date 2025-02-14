package com.capgemini.finally_block_execution;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) {
        //use try and catch to handle exception which may come during the execution
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            //get user input
            System.out.print("Enter your number 1: ");
            int num = Integer.parseInt(br.readLine());
            System.out.print("Enter your number 2: ");
            int num1 = Integer.parseInt(br.readLine());
            int result = FinallyBlockExecution.resultCalculate(num,num1);

        } catch (ArithmeticException e) {
            System.out.println("Exception caught " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Exception Caught " + e.getMessage());
        }finally {
            System.out.println("Operation completed");
        }
    }

}