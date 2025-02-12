package com.capgemini.queue_interface.circular_buffer_simulation;

public class Main {
    public static void main(String[] args) {
        CircularBuffer cb = new CircularBuffer(3);

        cb.insert(1);
        cb.insert(2);
        cb.insert(3);
        cb.printBuffer();
        cb.insert(4);
        cb.printBuffer();
    }
}
