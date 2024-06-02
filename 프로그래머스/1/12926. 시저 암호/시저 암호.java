class Solution {
    public String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();

        char[] arr = s.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            int cnt = 0;
            while (cnt < n) {
                if (Character.isLowerCase(arr[i])) {
                    if (arr[i] == 'z') {
                        arr[i] = 'a';
                        arr[i]--;
                    }
                    arr[i]++;
                } else if (Character.isUpperCase(arr[i])) {
                    if (arr[i] == 'Z') {
                        arr[i] = 'A';
                        arr[i]--;
                    }
                    arr[i]++;
                } else {
                    arr[i] = ' ';
                    break;
                }
                cnt++;
            }
            sb.append(arr[i]);
        }
        
        return sb.toString();
    }
}