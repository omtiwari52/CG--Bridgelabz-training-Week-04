package com.capgemini.list_interface.reverse_a_list;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        //initialize an arraylist & linkedList
        ArrayList<Integer> arr = new ArrayList<>();
        LinkedList<Integer> list = new LinkedList<>();

        //use try and catch to handle IOException if caught
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){

            //get user input for the number of elements in arraylist
            System.out.print("Enter number of elements in arraylist: ");
            int n = Integer.parseInt(br.readLine());

            //get user input for the number of elements in LinkedList
            System.out.print("Enter number of elements in Linkedlist: ");
            int n1 = Integer.parseInt(br.readLine());

            //use try and catch to handle NumberFormatException if occur
            try {
                System.out.println("Enter arraylist elements: ");
                for(int i = 0; i < n; i++){
                    int ele = Integer.parseInt(br.readLine());
                    arr.add(ele);
                }

                System.out.println("Enter arraylist elements: ");
                for(int i =0; i < n1; i++){
                    int ele = Integer.parseInt(br.readLine());
                    list.add(ele);
                }

                //invoke method to reverse arraylist
                ReverseArrayList.reverseArrayList(arr);

                System.out.print("Your Linked list before reverse is: ");
                for (Integer num : list) {
                    System.out.print(num + "->");
                }
                System.out.println("null");

                //invoke method to reverse Linkedlist
                ReverseLinkedList.reverseLinkedList(list);
                System.out.print("Your Linked list after reverse is: ");
                for (Integer num : list) {
                    System.out.print(num + "->");
                }
                System.out.println("null");
            }
            catch(NumberFormatException e){
                System.out.println("Exception Caught "+ e.getMessage());
            }
        }
        catch (IOException e){
            System.out.println("Exception Caught "+ e.getMessage());
        }
    }
}
