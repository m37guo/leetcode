package com.hermione.q205;

import java.util.HashMap;
import java.util.Map;

/**
 * @author vermouth
 * @date 2020/3/3
 */
public class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> map = new HashMap<>();
        Map<Character, Character> map2 = new HashMap<>();
        if (s.length() != t.length()) {
            return false;
        }
        int len = s.length();
        for (int i = 0; i < len; i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            if (map.containsKey(c1) || map2.containsKey(c2)) {
                if (map.containsKey(c1) && map.get(c1) != c2) {
                    return false;
                }
                if (map2.containsKey(c2) && map2.get(c2) != c1) {
                    return false;
                }
            } else {
                map.put(c1, c2);
                map2.put(c2, c1);
            }
        }
        return true;
    }
}
