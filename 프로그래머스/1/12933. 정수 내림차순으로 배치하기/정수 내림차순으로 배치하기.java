import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        List<Long> arrList = new ArrayList<Long>();
        int cnt=0;
        for(long i=n; i>0; i=i/10){
            arrList.add(i%10);
            cnt++;
        }
        arrList.sort(Comparator.reverseOrder());
        for(int i=0; i<arrList.size(); i++){
            cnt--;
            answer+=arrList.get(i)*Math.pow(10,cnt);
        }
        return answer;
    }
}