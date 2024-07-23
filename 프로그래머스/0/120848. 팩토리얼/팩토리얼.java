class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i=1; ; i++){
            n/=i;
            if(n==0){
                answer = i-1;
                break;
            }
        }
        return answer;
    }
}