import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        String[] answer = new String[my_string.length()];
        String str[] = my_string.split("");
        int idx = 0;
        for(int i=0; i<str.length; i++){
            answer[idx] = "";
            for(int j=i; j<str.length; j++){
                answer[idx]+=str[j];
            }
            idx++;
        }
        Arrays.sort(answer);
        return answer;
    }
}