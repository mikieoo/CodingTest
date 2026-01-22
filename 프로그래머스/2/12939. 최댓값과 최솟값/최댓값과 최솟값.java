import java.util.*;

class Solution {
        public String solution(String s) {
        String[] sarr = s.split(" ");
        int[] iarr = new int[sarr.length];
        for (int i = 0; i < sarr.length; i++) {
            iarr[i] = Integer.parseInt(sarr[i]);
        }

        int min = iarr[0];
        int max = iarr[0];
        for (int i = 1; i < iarr.length; i++) {
            if (max < iarr[i]) {
                max = iarr[i];
            }

            if (min > iarr[i]) {
                min = iarr[i];
            }
        }

        return min + " " + max;
    }
}