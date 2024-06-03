class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        if(numbers.length==2){
            return numbers[0]*numbers[1];
        }
        for(int i=0; i<numbers.length; i++){
            for(int j=0; j<numbers.length; j++){
                int num = numbers[i]*numbers[j];
                if(i!=j && answer<num){
                    answer=num;
                }
            }
        }
        return answer;
    }
}