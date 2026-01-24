import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        Set<String> used = new HashSet<>();

        int person = 1;
        int turn = 1;

        used.add(words[0]);

        int i = 0;
        while (i < words.length - 1) {
            person++;
            if (person > n) {
                person = 1;
                turn++;
            }

            String next = words[i + 1];

            // 중복 체크
            if (used.contains(next)) {
                return new int[] { person, turn };
            }

            // 끝말잇기 체크
            char last = words[i].charAt(words[i].length() - 1);
            char first = next.charAt(0);

            if (last != first) {
                return new int[] { person, turn };
            }

            used.add(next);
            i++;
        }

        return new int[] {0, 0};
    }
}
