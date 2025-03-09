// array implementation of stack

// package com.ayu;

import java.util.Array;

public class StackImpl {

    public static void main(String[] args) {
        // we'll test our implementation here.
        Stack<Integer> st = new Stack(Integer.class, 3);
        st.push(4);
        System.out.println("Peeked : " + st.peek());
        st.pop();

    }

    class Stack<T> {

        int size;
        int top = -1;
        T[] items;

        Stack(Class<T> clazz, int size) {
            this.items = (T[]) Array.newInstance(clazz, size);
            this.size = size;
        }

        void push(T item) {
            if (top > size) {
                throw new Exception("Overflow error. Cannot push more elements to the stack");
            } else {
                items[top + 1] = item;
                top += 1;
            }
        }

        T pop() {
            if (top <= -1) {
                throw new Exception("Underflow exeption. Nothing to pop.");
            } else {
                top -= 1;
            }
        }

        T peek() {
            if (top <= -1) {
                throw new Exception("Nothing to peek.");
            } else {
                return items[top];
            }
        }
        // empty
        // toString()

    }

}
