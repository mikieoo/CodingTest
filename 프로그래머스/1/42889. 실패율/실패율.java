import java.util.*;

class Solution {
    public Integer[] solution(int N, int[] stages) {
        int[] userCount = new int[N+2];
        double[] failureRate = new double[N+1];

        for (int stage : stages) {
            userCount[stage]++;
        }

        int totalUsers = stages.length;

        for (int i = 1; i <= N; i++) {
            if (totalUsers == 0) {
                failureRate[i] = 0.0;
            } else {
                failureRate[i] = (double) userCount[i] / totalUsers;
                totalUsers -= userCount[i];
            }
        }

        Integer[] sortedStages = new Integer[N];
        for (int i = 0; i < N; i++) {
            sortedStages[i] = i + 1;
        }

        Arrays.sort(sortedStages, (a, b) -> {
            if (failureRate[a] == failureRate[b]) {
                return a - b;
            } else {
                return Double.compare(failureRate[b], failureRate[a]);
            }
        });
        
        return sortedStages;
    }
}