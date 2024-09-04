import java.util.*;

class Solution
{
    public int solution(String s)
    {
        int answer = 0;

        List<Character> list = new ArrayList<>();
        for(int i=0; i<s.length(); i++){
            if(list.size()==0){
                list.add(s.charAt(i));
            }else if(s.charAt(i)==list.get(list.size()-1)){
                list.remove(list.size()-1);
            }else{
                list.add(s.charAt(i));
            }
        }
        if(list.size()==0){
            answer = 1;
        }
        return answer;
    }
}