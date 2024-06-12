import java.util.*;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        Arrays.sort(lottos);
        Arrays.sort(win_nums);

        int cnt = 0;
        for (int lotto : lottos) {
            if (lotto == 0) cnt++;
        }

        int index = cnt;
        int same = 0;
        for (int winNum : win_nums) {
            for (int j = index; j < lottos.length; j++) {
                if (winNum == lottos[j]) {
                    index++;
                    same++;
                }
            }
        }

        int[] arr = new int[]{same + cnt, same};

        int[] answer = new int[2];

        for (int i = 0; i < arr.length; i++) {
            switch (arr[i]) {
                case 6:
                    answer[i] = 1;
                    break;
                case 5:
                    answer[i] = 2;
                    break;
                case 4:
                    answer[i] = 3;
                    break;
                case 3:
                    answer[i] = 4;
                    break;
                case 2:
                    answer[i] = 5;
                    break;
                default:
                    answer[i] = 6;
                    break;
            }
        }
    
        return answer;
    }
}