package com.capgemini.multiple_catch_blocks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[0];
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("Enter the length of array: ");
            int n = Integer.parseInt(br.readLine().trim());
            arr = new int[n];
            // Get the values of the array from the user
            try{
                for (int i = 0; i < n; i++) {
                    arr[i] = Integer.parseInt(br.readLine().trim());
                }
            }catch(NumberFormatException e){
                System.out.println("Exception caught -> Invalid input number " + e.getMessage());
            }

            System.out.print("Enter the index you want to retrieve it: ");
            int index = Integer.parseInt(br.readLine().trim());

            if (!ArrayOperations.findValueAtIndex(arr,index)){
                throw new NullPointerException("Exception occurred ");
            }

        } catch (IOException e) {
            System.out.println("Exception caught IO exception " + e.getMessage());
        }catch (NullPointerException e){
            System.out.println("Array is not initialized");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index");
        }
    }
}
