class Solution {
    public int[] solution(int[] arr, int divisor) {
        int size = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]%divisor==0){
                size++;
            }
        }
        int[] answer = new int[size];
        if(size==0){
            answer = new int[1];
            answer[0] = -1;
        }
        int idx = 0;
        for(int i=0; i<arr.length; i++){
            int num = arr[i]%divisor;
            if(num==0){
                answer[idx]=arr[i];
                idx++;
            }
        }
        for(int i=0; i<answer.length; i++){
            for(int j=i+1; j<answer.length; j++){
                if(answer[i]>answer[j]){
                    int temp = answer[i];
                    answer[i] = answer[j];
                    answer[j] = temp;
                }
            }
        }
        return answer;
    }
}