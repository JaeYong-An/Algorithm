class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        for(int num1=i; num1<=j; num1++){
            int num2=num1;
            while(num2>0){
                if(num2%10==k){
                    answer++;
                }
                num2=num2/10;
            }
        }
        return answer;
    }
}