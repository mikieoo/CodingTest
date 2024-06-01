class Solution {
    public int solution(String A, String B) {
        int cnt = 0;
        for(int i=0; i<A.length()+1; i++){
            if(A.equals(B)){
                return cnt;
            }
            B = B.substring(1) + B.charAt(0);
            cnt++;
        }

        if(cnt > A.length()) return -1;
        else return cnt;
    }
}