class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i=1; i<=n; i++){
            int sum = 0;
            for(int j=0; j<n; j++){
                sum+=i+j;
                if(sum>n){
                    break;
                }else if(sum==n){
                    answer++;
                    break;
                }
            }
        }
        return answer;
    }
}