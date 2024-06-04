import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        ArrayList<Integer> array = new ArrayList<>();
        array.add(arr[0]);
        int idx = 0;
        for(int i=1; i<arr.length; i++){
            if(array.get(idx)!=arr[i]){
                idx++;
                array.add(arr[i]);
            }
        }
        int answer[] = new int[array.size()];
        for(int i=0; i<answer.length; i++){
            answer[i] = array.get(i);
        }
        return answer;
    }
}