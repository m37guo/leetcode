package com.hermione.q155;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @author vermouth
 * @date 2020/1/16
 */
public class MinStack {

    private Stack<Integer> stack = new Stack<>();
    private Map<Integer, Integer> map = new HashMap<>();
    private Stack<Integer> minStack = new Stack<>();

    /** initialize your data structure here. */
    public MinStack() {

    }

    public void push(int x) {
        stack.push(x);
        long min = minStack.isEmpty() ? Long.MAX_VALUE : minStack.peek();
        if (x < min) {
            minStack.push(x);
            map.put(x, 1);
        } else if (x == min) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
    }

    public void pop() {
        int top = stack.pop();
        if (top != minStack.peek()) {
            return;
        }
        if (map.get(top) == 1) {
            map.remove(top);
            minStack.pop();
        } else {
            map.put(top, map.get(top) - 1);
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}