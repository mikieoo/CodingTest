class Solution {
    public int solution(int[] common) {
        int lastIndex = common.length - 1;
        int answer = 0;

        if (common[lastIndex] - common[lastIndex - 1] == common[lastIndex - 1] - common[lastIndex - 2]) {
            answer = common[lastIndex] + (common[lastIndex] - common[lastIndex - 1]);
        } else {
            answer = common[lastIndex] * (common[lastIndex] / common[lastIndex - 1]);
        }
        
        return answer;
    }
}