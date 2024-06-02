import java.util.*;

class Solution {
    public ArrayList solution(int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        
        if(arr.length == 1) {
            answer.add(-1);
            return answer;
        }
        
        for (int num : arr) {
            answer.add(num);
        }

        answer.remove(Collections.min(answer));
        
        return answer;
    }
}