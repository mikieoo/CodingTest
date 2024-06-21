import java.util.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        String[] categories = {"RT", "CF", "JM", "AN"};

        StringBuilder sb = new StringBuilder();

        HashMap<Character, Integer> map = new HashMap<>();
        for (String category : categories) {
            map.put(category.charAt(0), 0);
            map.put(category.charAt(1), 0);
        }

        for (int i = 0; i < survey.length; i++) {
            char first = survey[i].charAt(0);
            char second = survey[i].charAt(1);
            int choice = choices[i];

            if (choice < 4) {
                map.put(first, map.get(first) + (4 - choice));
            } else if (choice > 4) {
                map.put(second, map.get(second) + (choice - 4));
            }
        }

        for (String category : categories) {
            char first = category.charAt(0);
            char second = category.charAt(1);

            if (map.get(first) > map.get(second)) {
                sb.append(first);
            } else if (map.get(first) < map.get(second)) {
                sb.append(second);
            } else {
                sb.append(first < second ? first : second);
            }
        }
        
        return sb.toString();
    }
}