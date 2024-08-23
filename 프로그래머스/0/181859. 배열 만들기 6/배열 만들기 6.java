import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            if(list.size()==0){
                list.add(arr[i]);
            }else if(list.get(list.size()-1)==arr[i]){
                list.remove(list.size()-1);
            }else{
                list.add(arr[i]);
            }
        }
        int[] answer = new int[list.size()];
        if(answer.length==0){
            answer = new int[1];
            answer[0] = -1;
        }else{
            for(int i=0; i<answer.length; i++){
                answer[i] = list.get(i);
            }
        }
        return answer;
    }
}