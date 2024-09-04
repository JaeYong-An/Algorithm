import java.util.*;

public class Solution {
    public int solution(int n) {
        int ans = 0;

        while(n!=0){
            ans++;
            for(int i=0; ; i++){
                if(Math.pow(2,i)>n){
                    n-=Math.pow(2,i-1);
                    break;
                }
            }
        }
        return ans;
    }
}