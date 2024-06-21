class Solution {
    public int solution(String[][] board, int h, int w) {
        String color = board[h][w];

        int cnt = 0;
        if (h - 1 >= 0 && color.equals(board[h - 1][w])) {
            cnt++;
        }

        if (h + 1 < board.length && color.equals(board[h + 1][w])) {
            cnt++;
        }

        if (w - 1 >= 0 && color.equals(board[h][w - 1])) {
            cnt++;
        }

        if (w + 1 < board[0].length && color.equals(board[h][w + 1])) {
            cnt++;
        }
        
        return cnt;
    }
}