class Solution {
    public int[] solution(int n) {
        int cnt = 0;
        int idx = 0;
        int num = n;
        int dup1 = 0;
        int dup2 = 0;
        while(n!=1){
            for(int i=2; i<=n; i++){
                if(n%i==0){
                    n/=i;
                    if(dup1!=i){
                        cnt++;
                    }
                    dup1 = i;
                    break;
                }
            }
        }
        int[] answer = new int[cnt];
        while(num!=1){
            for(int i=2; i<=num; i++){
                if(num%i==0){
                    num/=i;
                    if(dup2!=i){
                        answer[idx] = i;
                        idx++;
                    }
                    dup2 = i;
                    break;
                }
            }
        }
        return answer;
    }
}