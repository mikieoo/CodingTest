class Solution {
    boolean solution(String s) {
        char[] arr = s.toUpperCase().toCharArray();

        int p = 0;
        int y = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'P') p++;
            else if (arr[i] == 'Y') y++;
        }

        return p == y;
    }
}