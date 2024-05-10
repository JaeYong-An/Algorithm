class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int[2];
        int biggest = 0;
        int index = 0;
        for(int i=0; i<array.length; i++){
            biggest = array[i];
            for(int j=1; j<array.length; j++){
                if(biggest<array[j]){
                    biggest=array[j];
                    index=j;
                }
            }
        }
        answer[0] = biggest;
        answer[1] = index;
        return answer;
    }
}