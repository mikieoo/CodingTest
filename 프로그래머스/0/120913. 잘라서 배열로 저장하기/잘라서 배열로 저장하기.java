import java.util.*;

class Solution {
    public ArrayList solution(String my_str, int n) {
        ArrayList<String> list = new ArrayList<>();

        int index = 0;
        while (index < my_str.length()) {
            if (index + n < my_str.length()) {
                list.add(my_str.substring(index, index + n));
            } else {
                list.add(my_str.substring(index));
            }
            index += n;
        }

        return list;
    }
}