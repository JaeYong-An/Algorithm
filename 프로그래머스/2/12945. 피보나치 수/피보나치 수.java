class Solution {
    public int solution(int n) {
        int first = 0;
        int second = 1;
        for(int i=1; i<n; i++){
            int temp = second;
            second = first%1234567 + second%1234567;
            first = temp;
        }
        int answer = second%1234567;
        return answer;
    }
}