import java.util.*;

class Solution {
    public int[] solution(int n, int[] stages) {

        HashMap<Integer, Integer> failCnt = new HashMap<>();
        HashMap<Integer, Double> failRate = new HashMap<>();

        for (int i = 0; i < stages.length; i++) {
            int stage = stages[i];
            failCnt.put(stage, failCnt.getOrDefault(stage, 0) + 1);
        }

        int players = stages.length;

        for (int stage = 1; stage <= n; stage++) {
            int fail = failCnt.getOrDefault(stage, 0);
            double rate = players == 0 ? 0 : (double) fail / players;
            failRate.put(stage, rate);
            players -= fail;
        }

        for (Map.Entry<Integer, Double> entry : failRate.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        List<Integer> keySet = new ArrayList<>(failRate.keySet());

        keySet.sort(((o1, o2) -> failRate.get(o2).compareTo(failRate.get(o1))));

        int[] answer = new int[n];
        int idx = 0;
        for (int a : keySet) {
            answer[idx++] = a;
        }

        return answer;
    }
}
