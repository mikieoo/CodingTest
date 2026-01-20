import java.util.*;

class Solution {
    public int solution(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        int size1 = set.size(); // 3
        int size2 = nums.length / 2; // 2

        int answer = size1 < size2 ? size1 : size2;

        return answer;
    }
}