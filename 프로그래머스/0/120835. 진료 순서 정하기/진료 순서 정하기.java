import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        int idx = emergency.length;
        int sort[] = new int[emergency.length];
        for(int i=0; i<sort.length; i++){
            sort[i] = emergency[i];
        }
        Arrays.sort(sort);
        while(idx>0){
            for(int i=0; i<sort.length; i++){
                for(int j=0; j<emergency.length; j++){
                    if(emergency[j]==sort[i]){
                        answer[j] = idx;
                        idx--;
                    }
                }
            }
        }
        return answer;
    }
}