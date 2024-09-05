class Solution
{
    public int solution(int n, int a, int b)
    {
        int answer = 1;
        if(a>b){
            int temp = a;
            a = b;
            b = temp;
        }
        while(a+1!=b || a%2==0){
            if(a!=1){
                if(a%2==1){
                    a = (a+1)/2;
                }else{
                    a/=2;
                }
            }
            if(b!=1){
                if(b%2==1){
                    b = (b+1)/2;
                }else{
                    b/=2;
                }
            }
            answer++;
        }
        return answer;
    }
}