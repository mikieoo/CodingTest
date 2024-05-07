import java.util.*;

class Solution {
    public List solution(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=2; i<=n; i++){
            if(n%i == 0){
                while(n%i ==0){
                    n /= i;
                }
                list.add(i);
            }
        }
        return list;
    }
}


import java.util.*;

class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=2; i<=n; i++){
            if(n%i == 0){
                while(n%i ==0){
                    n /= i;
                }
                list.add(i);
            }
        }
        Collections.sort(list);
        answer = list.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}