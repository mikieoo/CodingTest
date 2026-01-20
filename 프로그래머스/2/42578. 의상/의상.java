import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;

        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < clothes.length; i++) {
            String type = clothes[i][1];
            if (map.containsKey(type)) {
                map.put(type, map.getOrDefault(type, map.get(type)) + 1);
            } else {
                map.put(type, map.getOrDefault(type, 0) + 1);
            }
        }

        for (int cnt : map.values()) {
            answer *= (cnt + 1);
        }

        return answer - 1;
    }
}