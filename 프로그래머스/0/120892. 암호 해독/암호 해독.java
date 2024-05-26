class Solution {
    public String solution(String cipher, int code) {
        int start = code - 1;

        StringBuilder sb = new StringBuilder();

        for(int i=start; i<cipher.length(); i+=code){
            sb.append(cipher.charAt(i));
        }
        return sb.toString();
    }
}