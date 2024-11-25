class Solution {
    public int[] solution(int[] numlist, int n) {
        int[] answer = new int[numlist.length];
        int result[] = new int[numlist.length];
        for(int i=0; i<numlist.length; i++){
            int num = (numlist[i] - n)*2;
            if(num<0){
                num = -1*num+1;
            }
            result[i] = num;
        }
        int min = 10000;
        for(int i=0; i<result.length; i++){
            int idx = result.length-1;
            for(int j=0; j<result.length; j++){
                if(result[i]<result[j]){
                    idx--;
                }
            }
            answer[idx] = numlist[i];
        }
        return answer;
    }
}