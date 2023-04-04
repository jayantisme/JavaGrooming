package org.example;

import java.util.Arrays;

public class CustomArrayList<T> {
    private int CAPACITY;
    private int size;
    private Object[] arr;

    CustomArrayList() {
        this.CAPACITY = 10;
        arr = new Object[CAPACITY];
        size = 0;
    }

    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public T get(int index) {
        if(index < 0 || index>= size)
            throw new IndexOutOfBoundsException();
        return (T) arr[index];
    }
    public void increaseCapacity() {
        Object[] temp = Arrays.copyOf(arr, size);
        this.size = CAPACITY;
        this.CAPACITY *= 2;
        this.arr = Arrays.copyOf(temp, CAPACITY);
    }

    public void add(int index, T value) {
        if (index < 0 || index > size)
            throw new IndexOutOfBoundsException();
        if (size == CAPACITY)
            increaseCapacity();
        int j = index;
        Object temp = arr[j];
        while (j < size) {
            arr[j + 1] = arr[j];
        }
        size++;
    }

    public void add(T value) {
        if (size == CAPACITY) {
            increaseCapacity();
        }
        arr[size++] = value;
    }
}
