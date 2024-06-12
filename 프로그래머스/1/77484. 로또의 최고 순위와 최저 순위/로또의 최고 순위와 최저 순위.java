class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int cnt = 0;
        for (int lotto : lottos) {
            if (lotto == 0) cnt++;
        }

        int same = 0;
        for (int lotto : lottos) {
            for (int win_num : win_nums) {
                if (lotto == win_num) {
                    same++;
                    break;
                }
            }
        }

        int[] arr = {same + cnt, same};

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