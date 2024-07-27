import java.util.*;

class Solution {
    public String solution(String s) {
        String my_s = "";
        String answer = "";
        String str[] = s.split("");
        for(int i=0; i<str.length; i++){
            boolean check = true;
            for(int j=0; j<str.length; j++){
                if(i!=j && str[i].equals(str[j])){
                    check = false;
                    break;
                }
            }
            if(check){
                my_s+=str[i];
            }
        }
        String ans[] = my_s.split("");
        Arrays.sort(ans);
        for(String st : ans){
            answer+=st;
        }
        return answer;
    }
}