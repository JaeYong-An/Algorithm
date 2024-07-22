class Solution {
    public int solution(int balls, int share) {
        int answer = 0;
        double up = 1;
        double down = 1;
        for(double i=balls; i>balls-share; i--){
            up*=i;
        }
        for(double i=share; i>0; i--){
            down*=i;
        }
        answer = (int)(up/down);
        return answer;
    }
}