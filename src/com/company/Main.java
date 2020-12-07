package com.company;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Stack<String> newStack = new Stack<>();
        try {
            newStack.add("One");
            newStack.add("Two");
            newStack.add("Three");
            newStack.add("Four");
            newStack.add("Five");
            newStack.add("Six");
            newStack.add("Seven");
            newStack.add("Eight");
            newStack.add("Nine");
            newStack.add("Ten");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            System.out.println(newStack);
        }
        reverseStack(newStack);
        deleteMiddle(newStack);
    }

    private static void reverseStack(Stack<String> newStack) {
        Stack<String> reversedStack = new Stack<String>();
        try {
            for (int count = newStack.size() - 1; count > -1; count--) {
                reversedStack.add(newStack.get(count));
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            System.out.println(reversedStack);
        }
    }

    private static void deleteMiddle(Stack<String> newStack) {
        int middle = newStack.size() / 2;
        try {
            newStack.remove(middle);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            System.out.println(newStack);
        }
    }
}

