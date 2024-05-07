class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] arr = {0, 0};

        for (String key : keyinput) {
            switch (key) {
                case "left":
                    if (arr[0] > -board[0] / 2) {
                        arr[0]--;
                    }
                    break;
                case "right":
                    if (arr[0] < board[0] / 2) {
                        arr[0]++;
                    }
                    break;
                case "up":
                    if (arr[1] < board[1] / 2) {
                        arr[1]++;
                    }
                    break;
                case "down":
                    if (arr[1] > -board[1] / 2) {
                        arr[1]--;
                    }
                    break;
            }
        }
        return arr;
    }
}

-----------------------------------------------------------------------------

import java.util.*;

class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int x = board[0] / 2;
        int y = board[1] / 2;

        int[] character = {0, 0};
        
        for (String key : keyinput) {
            switch (key) {
                case "left":
                    arr[0] = Math.max(-x, arr[0] - 1);
                    break;
                case "right":
                    arr[0] = Math.min(x, arr[0] + 1);
                    break;
                case "up":
                    arr[1] = Math.min(y, arr[1] + 1);
                    break;
                case "down":
                    arr[1] = Math.max(-y, arr[1] - 1);
                    break;
            }
        }
        
        return arr;
    }
}
