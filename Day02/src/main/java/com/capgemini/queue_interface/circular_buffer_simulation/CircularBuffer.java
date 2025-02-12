package com.capgemini.queue_interface.circular_buffer_simulation;


public class CircularBuffer {
    private int[] buffer;
    private int capacity, size, front, rear;

    public CircularBuffer(int capacity) {
        this.capacity = capacity;
        this.buffer = new int[capacity];
        this.size = 0;
        this.front = 0;
        this.rear = 0;
    }

    public int[] getBuffer() {
        return buffer;
    }

    public void insert(int value) {
        if (size == capacity) {
            front = (front + 1) % capacity;
        } else {
            size++;
        }
        buffer[rear] = value;
        rear = (rear + 1) % capacity;
    }


    public void printBuffer() {
        System.out.print("Buffer: ");
        for (int i = 0; i < size; i++) {
            System.out.print(buffer[(front + i) % capacity] + " ");
        }
        System.out.println();
    }


}