package com.capgemini.bank_transaction_system;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        //use try and catch to handle exception which may come during the execution
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){

            BankAccountSystem bank = new BankAccountSystem(500);

            //get user input
            System.out.println("Welcome to Bank System");
            System.out.println("1. Deposit \n2. Withdraw");
            System.out.print("Please write your choice: ");
            String choice = br.readLine().trim();

            if(choice.equalsIgnoreCase("deposit")){
                System.out.print("Enter amount you want to deposit: ");
                double depositAmount = Integer.parseInt(br.readLine().trim());
                bank.deposit(depositAmount);
            }

            else if(choice.equalsIgnoreCase("withdraw")){
                System.out.print("Enter amount you want to withdraw: ");
                double withdrawAmount = Integer.parseInt(br.readLine().trim());
                bank.withdraw(withdrawAmount);
            }

            //invoke method and print result
        }catch (InsufficientBalanceException e){
            System.out.println("Insufficient balance!");
        }
        catch(IllegalArgumentException e){ //catches illegal argument exception
            System.out.println("Invalid amount!");
        }catch (IOException e){ //catches IO exception
            System.out.println("Exception Caught "+ e.getMessage());
        }
    }
}
