class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int time = 0;
        int success = 0;
        int hp = health;
        for (int[] attack : attacks) {
            while (time < attack[0]) {
                time++;
                success++;
                if (time == attack[0]) break;
                hp += bandage[1];
                if (hp > health) {
                    hp = health;
                }
                if (success == bandage[0]) {
                    hp += bandage[2];
                    if (hp > health) {
                        hp = health;
                    }
                    success = 0;
                }
            }
            hp -= attack[1];
            if (hp <= 0) {
                return -1;
            }
            success = 0;
        }
        
        return hp;
    }
}