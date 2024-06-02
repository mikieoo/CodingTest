class Solution {
    public int solution(String[] babbling) {
        String[] arr = {"aya", "ye", "woo", "ma" };

        int answer = 0;
        for (int i = 0; i < babbling.length; i++) {
            String word = babbling[i];
            boolean valid = true;
            while (!word.isEmpty()) {
                boolean found = false;
                for (String s : arr) {
                    if (word.startsWith(s)) {
                        word = word.substring(s.length());
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    valid = false;
                    break;
                }
            }
            if (valid) {
                answer++;
            }
        }
        
        return answer;
    }
}