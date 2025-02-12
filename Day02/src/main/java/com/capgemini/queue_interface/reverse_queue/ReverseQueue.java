package com.capgemini.queue_interface.reverse_queue;

import java.util.Queue;
import java.util.Stack;

public class ReverseQueue {
    public Queue<Integer> reverseQueue(Queue<Integer> queue) {
        Stack<Integer> stack = new Stack<>();

        while (!queue.isEmpty()) {
            stack.push(queue.poll());
        }

        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }

        return queue;
    }

}
