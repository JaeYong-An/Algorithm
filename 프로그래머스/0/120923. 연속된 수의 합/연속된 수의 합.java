class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        if(num%2==0){
            for(int i=0; i<num; i++){
                answer[i] = total/num-(num/2)+1+i;
            }
        }else{
            for(int i=0; i<num; i++){
                answer[i] = total/num-num/2+i;
            }
        }
        return answer;
    }
}