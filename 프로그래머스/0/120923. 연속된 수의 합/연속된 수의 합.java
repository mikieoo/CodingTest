class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];

        int cnt = -1000;
        
        while (cnt < total) {
            int sum = 0;
            int hh = cnt;
            for (int i = 0; i < num; i++) {
                sum += hh;
                hh++;
            }
            if (sum == total) {
                break;
            }
            cnt++;
        }

        for (int i = 0; i < num; i++) {
            answer[i] = cnt;
            cnt ++;
        }
        
        return answer;
    }
}