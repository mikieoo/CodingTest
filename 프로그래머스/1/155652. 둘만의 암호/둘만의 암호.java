class Solution {
    public String solution(String s, String skip, int index) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int steps = 0;
            while (steps < index) {
                c++;
                if (c > 'z') {
                    c = 'a';
                }
                if (!skip.contains(String.valueOf(c))) {
                    steps++;
                }
            }
            sb.append(c);
        }
        
        return sb.toString();
    }
}