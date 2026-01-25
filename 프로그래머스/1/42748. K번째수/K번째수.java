import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int idx = 0; idx < commands.length; idx++) {
            int start = commands[idx][0] - 1;
            int end = commands[idx][1] - 1;
            int k = commands[idx][2] - 1;

            ArrayList<Integer> list = new ArrayList<>();
            for (int x = start; x <= end; x++) {
                list.add(array[x]);
            }

            Collections.sort(list);
            answer[idx] = list.get(k);
        }

        return answer;
    }
}
