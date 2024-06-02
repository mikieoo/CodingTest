import java.util.*;

class Solution {
    public ArrayList solution(String[] strings, int n) {
        ArrayList<Character> list = new ArrayList<>();
        ArrayList<String> answer = new ArrayList<>();

        for (String str : strings) {
            list.add(str.charAt(n));
        }

        Arrays.sort(strings);
        Collections.sort(list);

        boolean[] used = new boolean[strings.length];

        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < strings.length; j++) {
                if (!used[j] && list.get(i) == strings[j].charAt(n)) {
                    answer.add(strings[j]);
                    used[j] = true;
                    break;
                }
            }
        }
        
        return answer;
    }
}