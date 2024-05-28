import java.util.*;

class Solution {
    public String[] solution(String[] quiz) {
        List<String> list = new ArrayList<>();

        for (String q : quiz) {
            String[] parts = q.split(" ");
            int op1 = Integer.parseInt(parts[0]);
            String operator = parts[1];
            int op2 = Integer.parseInt(parts[2]);
            int result = Integer.parseInt(parts[4]);

            int cal_result = 0;
            switch (operator) {
                case "+":
                    cal_result = op1 + op2; break;
                case "-":
                    cal_result = op1 - op2; break;
            }

            if (cal_result == result) {
                list.add("O");
            } else {
                list.add("X");
            }
        }

        String[] answer = new String[list.size()];
        for (int i=0; i<answer.length; i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}