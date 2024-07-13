class Solution {
    public int[] solution(int num, int total) {
        
        int[] arr = new int[num];

        for (int start = -num; start <= total; start++) {
            int sum = 0;
            for (int i = 0; i < num; i++) {
                arr[i] = start + i;
                sum += arr[i];
            }
            if (sum == total) {
                break;
            }
        }
        
        return arr;
    }
}