class Solution {
    public int[] solution(int n) {
        int size = 0;
        for(int i=1; i<=n; i++){
            if(n%i==0){
                size++;
            }
        }
        int[] answer = new int[size];
        int idx = 0;
        for(int i=1; i<=n; i++){
            if(n%i==0){
                answer[idx] = i;
                idx++;
            }
        }
        return answer;
    }
}