class Solution {
    public int solution(int[] num_list) {
        int oddT = 1;
        int evenT = 1;
        int odd = 0;
        int even = 0;
        for(int i=num_list.length-1; i>=0; i--){
            if(num_list[i]%2==0){
                even+=num_list[i]*evenT;
                evenT*=10;
            }else{
                odd+=num_list[i]*oddT;
                oddT*=10;
            }
        }
        return even+odd;
    }
}