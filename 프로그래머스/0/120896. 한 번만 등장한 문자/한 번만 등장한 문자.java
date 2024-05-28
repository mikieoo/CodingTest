import java.util.*;

class Solution {
    public String solution(String s) {
        Map<Character, Integer> map = new TreeMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        StringBuilder sb = new StringBuilder();

        for (Map.Entry<Character, Integer> m : map.entrySet()) {
            if (m.getValue() == 1) {
                sb.append(m.getKey());
            }
        }
        
        return sb.toString();
    }
}