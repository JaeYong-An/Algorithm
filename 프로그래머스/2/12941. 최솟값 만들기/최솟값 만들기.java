import java.util.*;

class Solution
{
    public int solution(int []A, int []B)
    {
        List<Integer> s = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        for(int i : A){
            s.add(i);
        }
        for(int i : B){
            b.add(i);
        }
        b.sort(Comparator.reverseOrder());
        s.sort(Comparator.naturalOrder());
        int answer = 0;
        for(int i=0; i<b.size(); i++){
            answer+=s.get(i)*b.get(i);
        }
        return answer;
    }
}