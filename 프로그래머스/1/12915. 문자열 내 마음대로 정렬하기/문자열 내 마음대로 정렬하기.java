import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        ArrayList<Character> list = new ArrayList<>();

        for (String str : strings) {
            list.add(str.charAt(n));
        }

        Arrays.sort(strings);

        Collections.sort(list);

        String[] answer = new String[strings.length];
        boolean[] used = new boolean[strings.length];

        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < strings.length; j++) {
                if (!used[j] && list.get(i) == strings[j].charAt(n)) {
                    answer[i] = strings[j];
                    used[j] = true;
                    break;
                }
            }
        }
        
        return answer;
    }
}