class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int sum = sides[0] + sides[1];
        int longSide = sides[0]>sides[1] ? sides[0]:sides[1];
        int shortSide = longSide==sides[0] ? sides[1]:sides[0];
        for(int i=1; i<sum; i++){
            if(shortSide+i>longSide){
                answer++;
            }
            if(i>sum){
                answer++;
            }
        }
        return answer;
    }
}