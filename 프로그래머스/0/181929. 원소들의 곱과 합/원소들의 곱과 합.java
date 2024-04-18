class Solution {
    public int solution(int[] num_list) {
        int mul = 1;
        int sum = 0;
        for(int i : num_list){
            mul = mul * i;
            sum += i;
        }
        if(mul<Math.pow(sum,2)){
            return 1;
        }else{
            return 0;
        }
        // return answer;
    }
}