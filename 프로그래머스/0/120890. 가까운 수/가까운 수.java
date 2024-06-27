import java.util.*;
class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int result = 100;
        Arrays.sort(array);
        for(int i=0; i<array.length; i++){
            int smaller = Math.abs(array[i] - n);
            if(result>smaller){
                result = smaller;
                answer = array[i];
            }
        }
        return answer;
    }
}