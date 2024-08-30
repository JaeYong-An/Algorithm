import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int answerIdx = 0;
        for(int i=0; i<commands.length; i++){
            int idx = 0;
            int num[] = new int[commands[i][1]-commands[i][0]+1];
            for(int j=commands[i][0]-1; j<=commands[i][1]-1; j++){
                num[idx] = array[j];
                idx++;
            }
            Arrays.sort(num);
            answer[answerIdx] = num[commands[i][2]-1];
            answerIdx++;
        }
        return answer;
    }
}