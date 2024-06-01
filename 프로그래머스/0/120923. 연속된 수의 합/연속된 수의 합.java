import java.util.*;

class Solution {
    public ArrayList solution(int num, int total) {
        ArrayList<Integer> list = new ArrayList<>();

        int cnt = -100;
        
        while (cnt < total) {
            int sum = 0;
            int hh = cnt;
            for (int i = 0; i < num; i++) {
                sum += hh;
                hh++;
            }
            if (sum == total) {
                break;
            }
            cnt++;
        }

        for (int i = 0; i < num; i++) {
            list.add(cnt);
            cnt++;
        }
        
        return list;
    }
}