class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length-1];
        int n = arr[0];
        int ex = 0;
        if(arr.length>1){
            for(int i=1; i<arr.length; i++){
                if(n>arr[i]){
                    n=arr[i];
                    ex=i;
                }
            }
        }else{
            answer = new int[1];
            answer[0]=-1;
        }
        int idx = 0;
        for(int i=0; i<arr.length; i++){
            if(i!=ex){
                answer[idx]=arr[i];
                idx++;
            }
        }
        return answer;
    }
}