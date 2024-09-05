class Solution {
    public long solution(int n) {
        long answer = 1;
        int first = 0;
        int second = 1;
        for(int i=1; i<n; i++){
            int temp = first%1234567 + second%1234567;
            first = second%1234567;
            second = temp;
            answer = first + second;
        }
        return answer%1234567;
    }
}