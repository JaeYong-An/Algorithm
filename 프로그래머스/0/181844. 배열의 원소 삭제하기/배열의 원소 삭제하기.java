import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        int size = arr.length;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<delete_list.length; j++){
                if(arr[i]==delete_list[j]){
                    size--;
                    break;
                }
            }
        }
        int[] answer = new int[size];
        int idx = 0;
        for(int i=0; i<arr.length; i++){
            boolean trigger = false;
            for(int j=0; j<delete_list.length; j++){
                if(arr[i]==delete_list[j]){
                    trigger = true;
                    break;
                }
            }
            if(!trigger){
                answer[idx] = arr[i];
                idx++;
            }
        }
        return answer;
    }
}