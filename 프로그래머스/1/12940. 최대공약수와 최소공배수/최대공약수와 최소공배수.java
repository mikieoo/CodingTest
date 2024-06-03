class Solution {
    public int[] solution(int n, int m) {
        int max = Math.max(n, m);
        int min = Math.min(n, m);

        int divisor = 1;

        for (int i = min; i >= 2; i--) {
            while (n % i == 0 && m % i == 0) {
                divisor *= i;
                n /= i;
                m /= i;
            }
        }
        
        int multiple = divisor * (max / divisor) * (min / divisor);
        
        int[] answer = new int[2];
        
        answer[0] = divisor;
        answer[1] = multiple;
        
        return answer;
    }
}