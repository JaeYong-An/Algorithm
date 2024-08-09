class Solution {
    public String solution(int age) {
        String answer = "";
        String str = "";
        while(age>0){
            str+=(char)(age%10+97);
            age/=10;
        }
        String strAge[] = str.split("");
        for(int i=strAge.length-1; i>=0; i--){
            answer+=strAge[i];
        }
        return answer;
    }
}