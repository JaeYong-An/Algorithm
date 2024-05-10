class Solution {
    public int solution(int n) {
        int answer = 0;
        int num = n;
        int d = 10;
        while(num!=0){
            answer+=num%d;
            num=num/d;
        }
        return answer;
    }
}