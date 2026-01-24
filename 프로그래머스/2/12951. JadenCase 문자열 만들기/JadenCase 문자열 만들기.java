class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();

        char[] arr = s.toCharArray();

        char c = s.charAt(0);

        if (Character.isAlphabetic(c)) {
            sb.append(Character.toUpperCase(c));
        } else {
            sb.append(c);
        }

        for (int i = 1; i < arr.length; i++) {
            if (Character.isAlphabetic(arr[i]) && Character.isWhitespace(arr[i - 1])) {
                sb.append(Character.toUpperCase(arr[i]));
            } else {
                sb.append(Character.toLowerCase(arr[i]));
            }
        }

        return sb.toString();
    }
}