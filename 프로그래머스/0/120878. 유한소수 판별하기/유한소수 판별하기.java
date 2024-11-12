class Solution {
    public int solution(int a, int b) {
        int answer = 1;
        while(true){
            boolean check = true;
            for(int i=2; i<=a; i++){
                if(b%i==0 && a%i==0){
                    b/=i;
                    a/=i;
                    check = false;
                    break;
                }
            }
            if(check){
                break;
            }
        }
        while(b!=1){
            if(b%2==0){
                b/=2;
            }else if(b%5==0){
                b/=5;
            }else{
                return 2;
            }
        }
        return answer;
    }
}