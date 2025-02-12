package com.capgemini.queue_interface.implement_a_stack_using_queues;

import java.util.*;

public class ImplementStackFromQueue {

    //create two queue to implement stack
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    public boolean isEmpty(){
        return q1.isEmpty() && q2.isEmpty();
    }

    public void push(int data){
        if(!q1.isEmpty()){
            q1.add(data);
        }
        else{
            q2.add(data);
        }
    }

    // pop

    public int pop(){
        if(isEmpty()){
            System.out.println("Empty Stack");
            return -1;
        }

        int top = -1;
        if(!q1.isEmpty()){
            while(!q1.isEmpty()){
                top = q1.remove();
                if(q1.isEmpty()){
                    break;
                }
                q2.add(top);
            }
        }
        else{
            while(!q2.isEmpty()){
                top = q2.remove();
                if(q2.isEmpty()){
                    break;
                }
                q1.add(top);
            }
        }
        return top;
    }
    // peek

    public int peek(){
        if(isEmpty()){
            System.out.println("Empty Stack");
            return -1;
        }

        int top = -1;
        if(!q1.isEmpty()){
            while(!q1.isEmpty()){
                top = q1.remove();
                q2.add(top);
            }
        }
        else{
            while(!q2.isEmpty()){
                top = q2.remove();
                q1.add(top);
            }
        }
        return top;
    }
}
