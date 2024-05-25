import java.util.*;

class Solution {
    public int solution(int[] array, int n) {
        ArrayList<Integer> differences = new ArrayList<>();
        ArrayList<Integer> indices = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            int diff = Math.abs(n - array[i]);
            differences.add(diff);
        }
        
        int minDiff = Collections.min(differences);
        
        for (int i = 0; i < differences.size(); i++) {
            if (differences.get(i) == minDiff) {
                indices.add(i);
            }
        }
        
        if (indices.size() > 1) {
            int minValue = Integer.MAX_VALUE;
            for (int index : indices) {
                if (array[index] < minValue) {
                    minValue = array[index];
                }
            }
            return minValue;
        }
        
        return array[indices.get(0)];
    }
}