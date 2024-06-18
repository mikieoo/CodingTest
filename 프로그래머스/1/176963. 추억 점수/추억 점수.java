import java.util.*;

class Solution {
    public ArrayList solution(String[] name, int[] yearning, String[][] photo) {
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < name.length; i++) {
            map.put(name[i], yearning[i]);
        }

        ArrayList<Integer> score = new ArrayList<>();
        for (String[] ss : photo) {
            int sum = 0;
            for (String s : ss) {
                if (map.containsKey(s)) {
                    sum += map.get(s);
                }
            }
            score.add(sum);
        }
        
        return score;
    }
}