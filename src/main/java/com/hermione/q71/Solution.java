package com.hermione.q71;

import java.util.LinkedList;

/**
 * @author vermouth
 * @date 2020/3/3
 */
public class Solution {
    public String simplifyPath(String path) {
        String[] dirs = path.split("/");
        LinkedList<String> stack = new LinkedList<>();
        for (String dir: dirs) {
            if ("".equals(dir) || ".".equals(dir)) {
                continue;
            }
            if ("..".equals(dir)) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
                continue;
            }
            stack.push(dir);
        }
        StringBuilder sb = stack.isEmpty() ? new StringBuilder("/") : new StringBuilder();
        while(!stack.isEmpty()) {
            sb.append("/").append(stack.pollLast());
        }

        return sb.toString();
    }
}
