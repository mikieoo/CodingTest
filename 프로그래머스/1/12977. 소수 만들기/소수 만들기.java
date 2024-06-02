import java.util.*;

class Solution {
    public int solution(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        int answer = 0;

        int sum = 0;
        for (int num : nums) {
            sum += num;
        }

        for (int i = 2; i <= sum; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                list.add(i);
            }
        }

        int size = nums.length;
        for (int i = 0; i < size; i++) { 
            for (int j = i + 1; j < size; j++) { 
                for (int k = j + 1; k < size; k++) {
                    int prime = nums[i] + nums[j] + nums[k];
                    if (list.contains(prime)) answer++;
                }
            }
        }
        
        return answer;
    }
}