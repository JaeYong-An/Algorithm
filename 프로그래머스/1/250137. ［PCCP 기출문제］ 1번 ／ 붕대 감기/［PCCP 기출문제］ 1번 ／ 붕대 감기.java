class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int answer = 0;
        int monsterAttack = 0;
        int success = 0;
        int realHealth = health;
        for(int i = 1; i<=attacks[attacks.length-1][0]; i++){
            if(attacks[monsterAttack][0] == i){
                realHealth -= attacks[monsterAttack][1];
                if(realHealth <= 0){
                    answer = -1;
                    return answer;
                }else if(monsterAttack == attacks.length-1){
                    answer = realHealth;
                    return answer;
                }
                else{
                    monsterAttack ++; 
                    success = 0;
                }
            }else{
                if(realHealth == health){
                    success++;
                    answer = realHealth;
                }else{
                    success++;
                    if(success == bandage[0]){
                        realHealth += bandage[2];
                        success = 0;
                    }
                    realHealth += bandage[1];
                    if(realHealth > health){
                        realHealth = health;
                    }
                    answer = realHealth;
                }
            }
        }
        return answer;
    }
}