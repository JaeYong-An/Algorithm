class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        int num1 = dots[0][0];
        int num2 = dots[0][1];
        int num3 = 0;
        int num4 = 0;
        for(int i=1; i<dots.length; i++){
            if(dots[i][0]==num1){
                num3 = Math.abs(dots[i][1]-num2);
            }
            if(dots[i][1]==num2){
                num4 = Math.abs(dots[i][0]-num1);
            }
        }
        answer = num3*num4;
        return answer;
    }
}