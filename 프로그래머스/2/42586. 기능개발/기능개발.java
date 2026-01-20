import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        ArrayList<Integer> list = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < progresses.length; i++) {
            int remain = (100 - progresses[i] + speeds[i] - 1) / speeds[i];
            queue.offer(remain);
        }

        while (!queue.isEmpty()) {
            int max = queue.poll(); 
            int count = 1;

            while (!queue.isEmpty() && queue.peek() <= max) {
                count++;
                queue.poll();
            }

            list.add(count);
        }

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}