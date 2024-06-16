import java.util.*;

class Solution {
    public int[] solution(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        int[] arr = new int[s.length()];

        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(!map.containsKey(c)){
                map.put(c, i);
                arr[i] = -1;
            } else {
                arr[i] = i - map.get(c);
                map.replace(c, i);
            }
        }
        
        return arr;
    }
}