class Solution {
    public int solution(int n) {
        int answer = 0;
        int num1 = check(n);
        for(int i=n+1; ;i++){
            int num2 = check(i);
            if(num1==num2){
                answer = i;
                break;
            }
        }
        return answer;
    }
    
    public int check(int n){
        int i = 0;
        while(n!=0){
            if(n%2==1){
                i++;
            }
            n/=2;
        }
        return i;
    }
}