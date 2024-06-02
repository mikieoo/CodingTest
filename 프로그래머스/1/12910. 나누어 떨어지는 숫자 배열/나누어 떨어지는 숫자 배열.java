import java.util.*;

class Solution {
    public ArrayList solution(int[] arr, int divisor) {
        ArrayList<Integer> list = new ArrayList<>();
        
        Arrays.sort(arr);
        
        for (int num : arr) {
            if (num % divisor == 0) {
                list.add(num);
            }
        }
        
        if(!list.isEmpty()) return list;
        else list.add(-1);
        
        return list;
    }
}