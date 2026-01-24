import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {

        Queue<Integer> weightQueue = new LinkedList<>();
        Queue<Integer> exitTimeQueue = new LinkedList<>();

        int time = 0;
        int bridgeWeight = 0;
        int idx = 0;

        while (idx < truck_weights.length || !weightQueue.isEmpty()) {

            time++;

            if (!exitTimeQueue.isEmpty() && exitTimeQueue.peek() == time) {
                bridgeWeight -= weightQueue.poll();
                exitTimeQueue.poll();
            }

            if (idx < truck_weights.length &&
                bridgeWeight + truck_weights[idx] <= weight) {

                weightQueue.offer(truck_weights[idx]);
                exitTimeQueue.offer(time + bridge_length);
                bridgeWeight += truck_weights[idx];
                idx++;
            }
        }

        return time;
    }
}
