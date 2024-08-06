class Solution {
    public int[] solution(int n) {
        int size = 0;
        int i = n;
        while(i!=1){
            if(i%2==0){
                size++;
                i/=2;
            }else{
                size++;
                i = i*3+1;
            }
        }
        int[] answer = new int[size+1];
        int idx = 0;
        while(n!=1){
            if(n%2==0){
                answer[idx] = n;
                n/=2;
                idx++;
            }else{
                answer[idx] = n;
                n = n*3+1;
                idx++;
            }
        }
        answer[idx] = 1;
        return answer;
    }
}