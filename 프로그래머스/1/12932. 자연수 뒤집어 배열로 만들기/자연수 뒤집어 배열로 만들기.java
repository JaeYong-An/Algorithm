class Solution {
    public int[] solution(long n) {
        int size = 0;
        for(long i=n; i>0; i=i/10){
            size++;
        }
        int[] answer = new int[size];
        int idx=0;
        for(long i=n; i>0; i=i/10){
            answer[idx]=(int)(i%10);
            idx++;
        }
        return answer;
    }
}