import java.util.*;

class Solution {
    public String solution(int a, int b) {
        String[] days = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};

        Calendar calendar = Calendar.getInstance();

        calendar.set(2016, a - 1, b);

        int day = calendar.get(Calendar.DAY_OF_WEEK);
        
        return days[day - 1];
    }
}