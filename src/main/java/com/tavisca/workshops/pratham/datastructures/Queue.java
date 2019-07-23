package com.tavisca.workshops.pratham.datastructures;

import java.util.ArrayList;

public class Queue<T> {
    ArrayList<T> queue;
    private int capacity;
    public static final int defaultCapacity = 8;
    private int front;
    private int rear;

    Queue(int capacity) {
        this.capacity = capacity;
        queue = new ArrayList<>(this.capacity);
        front = rear = -1;
    }

    Queue() { this(defaultCapacity); }

    void add(T data) throws OverflowException {
//        if ((rear + 1) % this.capacity == front)
//            throw new OverflowException();
//        else if(front == -1)
//            front = rear = 0;
//        else if (rear == this.capacity - 1 && front != 0)
//            rear = 0;
//        else
//            rear += 1;
//
//        queue.add(rear, data);
        if (isFull())
            throw new OverflowException();
        else {
            if (front == -1)
                front = 0;
            rear = (rear + 1) % this.capacity;
            queue.add(rear, data);
        }
    }

    T remove() throws UnderflowException {
//        if(front == -1)
//            throw new UnderflowException();
//
//        T data = queue.get(front);
//        queue.remove(front);
//
//        if (front == rear)
//            front = rear = -1;
//        else if (front == this.capacity - 1)
//            front = 0;
//        else
//            front++;
//
//        return data;
        T data;
        if (isEmpty())
            throw new UnderflowException();
        else {
            data = queue.get(front);
            if (front == rear)
                front = rear = -1;
            else
                front = (front + 1) % this.capacity;

            return data;
        }
    }

    int capacity() {
        return this.capacity;
    }

    boolean isFull() {
        if ((front == 0 && rear == this.capacity - 1) || front == rear + 1)
            return true;
        return false;
    }

    boolean isEmpty() {
        if (front == -1)
            return true;
        return false;
    }
}

class OverflowException extends RuntimeException {
    @Override
    public String toString() {
        return "The Queue is Full";
    }
}

class UnderflowException extends RuntimeException {
    @Override
    public String toString() {
        return "The Queue is Empty";
    }
}
