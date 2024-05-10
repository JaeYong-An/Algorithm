class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int side[] = sides;
        for(int i=0; i<side.length; i++){
            for(int j=i; j<side.length; j++){
                if(side[i]>side[j]){
                    int temp = side[i];
                    side[i]=side[j];
                    side[j]=temp;
                }
            }
        }
        if(side[0]+side[1]>side[2]){
            answer=1;
        }else{
            answer=2;
        }
        return answer;
    }
}