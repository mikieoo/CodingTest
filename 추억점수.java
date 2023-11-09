package exam;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[] name = {"may", "kein", "kain", "radi"};
        int[] yearning = {5, 10, 1, 3};

        String[][] photo =
                {{"may"},{"kein", "deny", "may"},
                		{"kon", "coni"}};

        HashMap<String, Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < name.length; i++) {
            map.put(name[i], yearning[i]);
        }
        
        int sum = 0;

        for (int i = 0; i < photo.length; i++) {
            for (int j = 0; j < photo[i].length; j++) {
                String currentName = photo[i][j];
                if (map.containsKey(currentName)) {
                    int value = map.get(currentName);
                    sum += value;
                }
            }
            
            list.add(sum);
            sum = 0;
        }

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

    }
}
