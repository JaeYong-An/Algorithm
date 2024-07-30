class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        for(int i=1; i<=brown; i++){
            for(int j=3; j<=brown; j++){
                if(i*2+(j-2)*2==brown && (i-2)*(j-2)==yellow){
                    answer[0] = i;
                    answer[1] = j;
                    break;
                }
            }
        }
        return answer;
    }
}