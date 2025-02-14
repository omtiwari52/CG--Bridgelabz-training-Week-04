package com.capgemini.nested_try_catch_block;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {

        //use try and catch to handle exception which may come during the execution
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){

            //get user input
            System.out.print("Enter size of your array: ");
            int size = Integer.parseInt(br.readLine());
            int[] arr = new int[size];
            try {
                System.out.println("Enter array elements: ");
                for(int i = 0; i < size; i++){
                    arr[i] = Integer.parseInt(br.readLine());
                }
            }catch (NumberFormatException e){
                System.out.println("Exception caught NumberFormatException "+ e.getMessage());
            }
            System.out.print("Enter divisor: ");
            int divisor = Integer.parseInt(br.readLine());
            System.out.print("Enter index: ");
            int index = Integer.parseInt(br.readLine());

            DivideArrayElement.divideElementOnIndex(arr,divisor,index);

            //invoke method and print result
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid array index!");
        }catch(ArithmeticException e){ //catches illegal argument exception
            System.out.println("Cannot divide by zero!");
        }catch (IOException e){ //catches IO exception
            System.out.println("Exception Caught "+ e.getMessage());
        }
    }
}
