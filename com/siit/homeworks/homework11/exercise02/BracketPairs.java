package com.siit.homeworks.homework11.exercise02;

import java.util.Stack;


public class BracketPairs {

    public boolean checkBracketPairs(String s) {
        String test = s;

        Stack<Integer> stack = new Stack<Integer>();
        if (!test.chars().allMatch(a -> a == '{' || a == '}' || a == '[' || a == ']' || a == '(' || a == ')')) {
            return false;
        }
        long counter = test.chars().filter(x -> {
            if (stack.size() == 0 && (x == 40 || x == 123 || x == 91)) {
                stack.add(x);
                return false;
            } else {
                int head = stack.peek();
                if ((head == 40 && x == 41) || (head == 123 && x == 125) || (head == 91 && x == 93)) {

                    stack.pop();

                    return false;
                } else if (x == 40 || x == 123 || x == 91) {
                    stack.push(x);

                    return false;
                } else {
                    return true;
                }
            }
        }).count();
        if (counter == 0l)
            return true;
        return false;
    }


}

