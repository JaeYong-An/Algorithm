import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=l; i<=r; i++){
            boolean check = true;
            int num = i;
            while(num!=0){
                if((num%10)==5 || (num%10)==0){
                    num/=10;
                }else{
                    check = false;
                    break;
                }
            }
            if(check){
                list.add(i);
            }
        }
        int[] answer = new int[list.size()];
        if(list.size()==0){
            answer = new int[]{-1};
            return answer;
        }
        for(int i=0; i<answer.length; i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}