class Solution {
    public String solution(String s, int n) {
        String answer = "";

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            int num = c + n; // 122 + 4 = 126

            if (Character.isUpperCase(c)) {
                if (num > 'Z') {
                    num -= 'Z';
                    answer += (char) ('A' + num - 1);
                    continue;
                }
                answer += (char) (c + n);
            } else if (Character.isWhitespace(c)) {
                answer += " ";
            } else {
                if (num > 'z') {
                    num -= 'z'; // 122 97 ~ 122
                    answer += (char) ('a' + num - 1);
                    continue;
                }
                answer += (char) (c + n);
            }
        }

        return answer;
    }
}