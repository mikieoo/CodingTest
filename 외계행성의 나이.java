class Solution {
    public String solution(int age) {
        String str = String.valueOf(age);

        String answer = str
            .replace("0", "a")
            .replace("1", "b")
            .replace("2", "c")
            .replace("3", "d")
            .replace("4", "e")
            .replace("5", "f")
            .replace("6", "g")
            .replace("7", "h")
            .replace("8", "i")
            .replace("9", "j");
        
        return answer;
    }
}

-----------------------------------------------

class Solution {
    public String solution(int age) {
        String str = String.valueOf(age);

        String answer = "";

        for(int i=0; i<str.length(); i++){
            char c = str.charAt(i);
            answer += (char)(c + 49);
        }
        return answer;
    }
}