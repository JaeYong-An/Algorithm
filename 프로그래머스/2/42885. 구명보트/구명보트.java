import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = people.length;
        Arrays.sort(people);
        int cnt = 0;
        for(int i=people.length-1; i>=0; i--){
            if(cnt==i){
                break;
            }
            if(people[i]+people[cnt]<=limit){
                answer--;
                cnt++;
            }
            if(cnt==i){
                break;
            }
        }
        return answer;
    }
}