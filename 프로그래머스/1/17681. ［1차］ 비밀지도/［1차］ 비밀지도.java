import java.util.*;

class Solution {
    public ArrayList solution(int n, int[] arr1, int[] arr2) {
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder(Integer.toBinaryString(arr1[i] | arr2[i]));

            while (sb.length() < n) {
                sb.insert(0, "0");
            }

            list.add(sb.toString().replace('1', '#').replace('0', ' '));
        }
        
        return list;
    }
}