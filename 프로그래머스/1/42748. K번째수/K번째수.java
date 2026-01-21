import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int cmdIdx = 0; cmdIdx < commands.length; cmdIdx++) {
            int start = commands[cmdIdx][0]; // i 2
            int end = commands[cmdIdx][1]; // j 5
            int k = commands[cmdIdx][2]; // k 3

            // [5,2,6,3] (1,2,3,4)
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = start; i <= end; i++) { // 2 3 4 5 
                list.add(array[i - 1]);
            }
            Collections.sort(list);
            answer[cmdIdx] = list.get(k - 1);
        }

        return answer;
    }
}