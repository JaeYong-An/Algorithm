import java.util.*;

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[5];
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i : num_list){
            arr.add(i);
        }
        arr.sort(Comparator.naturalOrder());
        for(int i=0; i<5; i++){
            answer[i] = arr.get(i);
        }
        return answer;
    }
}