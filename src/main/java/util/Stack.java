package util;

public class Stack {
    int size;
    char[] arr;
    int current;

    public Stack(int size) {
        this.size = size;
        this.current = 0;
        arr = new char[size];
    }

    public void push(char element) {
        if (current == size) {
            throw new IndexOutOfBoundsException("stack is full");
        }
        arr[current++] = element;
    }

    public char pop() {
        if (current == 0) {
            return 0;
        }
        return arr[--current];
    }

    public char peek() {
        return arr[current - 1];
    }

    public boolean isEmpty() {
        return current == 0;
    }

    public boolean isFull() {
        return current == size;
    }
}
