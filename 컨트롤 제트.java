import java.util.*;

class Solution {
    public int solution(String s) {
	// list에 추가하는데 만약 Z가 나온다면 그 앞전의 list 원소를 제거..?
        // 그리고 만약 10 Z 20 Z 처럼 아무것도 남지 않을 경우 즉 list 가 비어있으면 0
        // 그게 아니라면 add 함
        String[] arr = s.split(" ");

        List<Integer> list = new ArrayList<>();

        for(int i=0; i<arr.length; i++){
            if(arr[i].equals("Z")){
                if(!list.isEmpty()){
                    list.remove(list.size()-1);
                }
            } else {
                list.add(Integer.parseInt(arr[i]));
            }
        }

        int answer = 0;
        for(int num : list) {
            answer += num;
        }
        
        return answer;
    }
}