class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];

        for(int i=0; i<quiz.length; i++){
            String[] arr = quiz[i].split(" ");
            int num1 = Integer.parseInt(arr[0]);
            int num2 = Integer.parseInt(arr[2]);
            int result = Integer.parseInt(arr[4]);
            switch (arr[1]){
                case "+":
                    answer[i] = num1 + num2 == result ? "O" : "X";
                    break;
                case "-":
                    answer[i] = num1 - num2 == result ? "O" : "X";
                    break;
            }
        }
        
        return answer;
    }
}