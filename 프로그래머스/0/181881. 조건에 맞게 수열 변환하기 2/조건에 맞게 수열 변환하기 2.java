class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        int same=0;
        while(true){
            same = 0;
            for(int i=0; i<arr.length; i++){
                if(arr[i]>=50 && arr[i]%2==0){
                    arr[i] = arr[i]/2;
                }else if(arr[i]<50 && arr[i]%2==1){
                    arr[i] = arr[i]*2+1;
                }else{
                    same++;
                }
            }
            if(same==arr.length){
                break;
            }
            answer++;
        }
        return answer;
    }
}