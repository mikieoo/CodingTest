import java.util.*;

class Solution {
    public List solution(int[] emergency) {
        List<Integer> list = new ArrayList<>();
        List<Integer> answer = new ArrayList<>();

        for (int n : emergency) {
            list.add(n);
        }

        list.sort(Collections.reverseOrder());

        for (int i = 0; i < list.size(); i++) {
            int index = list.indexOf(emergency[i]);
            answer.add(index + 1);
        }
        
        return answer;
    }
}

------------------------------------------------------

class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];

        for(int i = 0; i < answer.length; i++){
            int idx = 1;
            for(int j = 0; j < answer.length; j++){
                if(emergency[i] < emergency[j]){
                    idx++;
                }
            }
            answer[i] = idx;
        }
        
        return answer;
    }
}