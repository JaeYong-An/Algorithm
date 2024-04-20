class Solution {
    public int solution(int n) {
        int answer = 0;
        int pizza = 6;
        int mul = 0;
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=pizza; j++){
                if(i==j && (n%i==0 && pizza%j==0)){
                    mul=i;
                }
            }
        }
        answer = ((pizza*n)/mul)/pizza;
        return answer;
    }
}