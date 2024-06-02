import java.util.*;

class Solution {
    public ArrayList solution(int[] arr, int divisor) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int num : arr) {
            if (num % divisor == 0) {
                list.add(num);
            }
        }
        
        Collections.sort(list);
        
        if(!list.isEmpty()) return list;
        else list.add(-1);
        
        return list;
    }
}