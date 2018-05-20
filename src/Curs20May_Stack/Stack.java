package Curs20May_Stack;

import java.util.Arrays;

public class Stack {
    //the index pf the most recent insertion
    private int top = 0;
    private int[] content = new int[5];

    public boolean isEmpty() {
        return (top == 0);
    }

    public void push(int element) {
        if (top + 1 == content.length) {
            increaseStack();
        }
        content[top + 1] = element;
        top++;

    }

    public int pop() {
        int element = content[top];
        top--;
        return element;
    }
/*
    public static boolean isValid(int newIndex) {
        if (newIndex > 4 || newIndex < 1) {
            System.out.println("In afara");
            return false;
        }
        return true;

    }
    */

    private void increaseStack() {
        int[] newArray = new int[content.length + content.length / 2];
      //  newArray = Arrays.copyOf(content, content.length);
        System.arraycopy(content,0,newArray,0,content.length);
        content = newArray;
    }
}
