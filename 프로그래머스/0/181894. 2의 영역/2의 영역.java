class Solution {
    public int[] solution(int[] arr) {
        int start = -1;
        int end = -1;
        boolean trigger = false;
        for(int i=0; i<arr.length; i++){
            if(!trigger && arr[i]==2){
                start = i;
                trigger = true;
            }
            if(trigger && arr[i]==2){
                end = i;
            }
        }
        int[] answer = {};
        int idx = 0;
        if(trigger && end==-1){
            end = start;
        }
        if(start==-1){
            answer = new int[1];
            answer[0] = -1;
        }else{
            answer = new int[end-start+1];
            for(int i=start; i<=end; i++){
                answer[idx] = arr[i];
                idx++;
            }
        }
        return answer;
    }
}