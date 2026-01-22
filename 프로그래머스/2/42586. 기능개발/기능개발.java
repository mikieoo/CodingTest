import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {

        ArrayList<Integer> list = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < progresses.length; i++) {
            int num = (int) Math.ceil((100 - progresses[i]) / (double) speeds[i]); // 7 2 9
            queue.offer(num); // 9 2 7
        }

        while (!queue.isEmpty()) {
            int base = queue.poll();
            int count = 1;

            while (!queue.isEmpty() && queue.peek() <= base) {
                queue.poll();
                count++;
            }

            list.add(count);
        }

        int[] answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}