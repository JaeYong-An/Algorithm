class Solution {
    public boolean solution(int x) {
        int sum = 0;
        for(int i=x; i>0; i=i/10){
            sum+=i%10;
        }
        return x%sum==0;
    }
}