최빈값 구하기

class Solution {
    public int solution(int[] array) {
        int answer = 0; // 최빈값
        int[] index = new int[1000];
        int max = 0; // 최대값
        int cnt = 0;
        
        for(int n : array){
            index[n]++;
            if(max < index[n]){
                max = index[n];
                answer = n;
            } 
        }
        
        for(int n: index){
            if(max == n) cnt++;
            if(cnt > 1) answer = -1;
        }
        
        return answer;
    }
}