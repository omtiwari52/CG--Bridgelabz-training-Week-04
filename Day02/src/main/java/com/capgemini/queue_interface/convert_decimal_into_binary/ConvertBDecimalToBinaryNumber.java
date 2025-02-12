package com.capgemini.queue_interface.convert_decimal_into_binary;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ConvertBDecimalToBinaryNumber {
    // Method to convert decimal number to the binary number
    public List<String> convertToBinary(int N){
        List<String> result = new ArrayList<>();
        Queue<String> queue = new LinkedList<>();

        queue.add("1");

        for (int i = 1; i <= N; i++) {
            String current = queue.poll();
            result.add(current);
            queue.add(current + "0");
            queue.add(current + "1");
        }

        return result;

    }
}
