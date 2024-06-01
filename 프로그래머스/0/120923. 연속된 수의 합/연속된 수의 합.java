import java.util.*;

class Solution {
    public ArrayList solution(int num, int total) {
        ArrayList<Integer> list = new ArrayList<>();

        int cnt;
        if (total == 0) {
            cnt = -100;
        } else {
            cnt = -total;
        }
        
        if(num == 1) {
            list.add(total);
            return list;
        }

        while (cnt < total) {
            int sum = 0;
            int hh = cnt;
            for (int i = 0; i < num; i++) {
                sum += hh;
                hh++;
            }
            if (sum == total) {
                list.add(cnt);
                break;
            }
            cnt++;
        }

        for (int i = 0; i < num - 1; i++) {
            list.add(list.get(i) + 1);
        }
        
        return list;
    }
}