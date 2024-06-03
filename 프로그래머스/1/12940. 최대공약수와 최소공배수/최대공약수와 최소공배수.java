class Solution {
    public int[] solution(int n, int m) {
        int max = Math.max(n, m);
        int min = Math.min(n, m);

        int divisor = 1;
        int multiple;

        int m1 = max;
        int m2 = min;
        for (int i = min; i >= 2; i--) {
            while (m1 % i == 0 && m2 % i == 0) {
                divisor *= i;
                m1 /= i;
                m2 /= i;
            }
        }
        
        multiple = divisor * (max / divisor) * (min / divisor);
        
        int[] answer = new int[2];
        
        answer[0] = divisor;
        answer[1] = multiple;
        
        return answer;
    }
}