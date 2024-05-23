class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        while(n>=a){
            int coke = n/a*b;
            n-=n/a*a;
            n+=coke;
            answer+=coke;
        }
        return answer;
    }
}