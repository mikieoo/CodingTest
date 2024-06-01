class Solution {
    public int solution(String A, String B) {
        if(A.equals(B)) {
            return 0;
        }
        

        for (int i = 0; i < B.length(); i++) {
            if (A.equals(B)) {
                return i;
            }
            B = B.substring(1) + B.substring(0, 1);
        }
        
        return -1;

    }
}