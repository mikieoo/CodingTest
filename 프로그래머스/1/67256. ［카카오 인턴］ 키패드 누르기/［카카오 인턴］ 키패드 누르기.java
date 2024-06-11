class Solution {
    public String solution(int[] numbers, String hand) {
        char[][] keypad = {
                {'1', '2', '3'},
                {'4', '5', '6'},
                {'7', '8', '9'},
                {'*', '0', '#'}};

        StringBuilder sb = new StringBuilder();

        int[] left_pos = {3, 0};
        int[] right_pos = {3, 2};

        for (int num : numbers) {
            char target = (char) (num + '0');
            for (int i = 0; i < keypad.length; i++) {
                for (int j = 0; j < keypad[i].length; j++) {
                    if (keypad[i][j] == target) {
                        if (j == 0) {
                            sb.append("L");
                            left_pos = new int[]{i, j};
                        } else if (j == 2) {
                            sb.append("R");
                            right_pos = new int[]{i, j};
                        } else {
                            int left_dist = Math.abs(left_pos[0] - i) + Math.abs(left_pos[1] - j);
                            int right_dist = Math.abs(right_pos[0] - i) + Math.abs(right_pos[1] - j);
                            if (left_dist < right_dist || (left_dist == right_dist && hand.equals("left"))) {
                                sb.append("L");
                                left_pos = new int[]{i, j};
                            } else {
                                sb.append("R");
                                right_pos = new int[]{i, j};
                            }
                        }
                        break;
                    }
                }
            }
        }
        
        return sb.toString();
    }
}
