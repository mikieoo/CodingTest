class Solution {
    public int solution(String[] babbling) {
        String[] arr = {"aya", "ye", "woo", "ma"};

        for (int i = 0; i < babbling.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (babbling[i].contains(arr[j])) {
                    babbling[i] = babbling[i].replace(arr[j], "*");
                }
            }
        }

        int answer = 0;

        for (String s : babbling) {
            int cnt = 0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == '*') {
                    cnt++;
                }
            }

            if (cnt == s.length()) {
                answer++;
            }
        }
        
        return answer;
    }
}