import java.util.*;

class Solution {
    public ArrayList solution(String[] players, String[] callings) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList(players));

        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < players.length; i++) {
            map.put(players[i], i);
        }

        for (String calling : callings) {
            int currentIndex = map.get(calling);
            if (currentIndex > 0) {
                String aheadPlayer = list.get(currentIndex - 1);
                list.set(currentIndex - 1, calling);
                list.set(currentIndex, aheadPlayer);

                map.put(calling, currentIndex - 1);
                map.put(aheadPlayer, currentIndex);
            }
        }
        
        return list;
    }
}