class Solution {
    public String solution(String s, int n) {
        String answer = "";
        char str[] = s.toCharArray();
        for(int i=0; i<str.length; i++){
            if(str[i]==' '){
                answer+=str[i]+"";
            }else{
                if((str[i]>=65 && str[i]<=90) && (str[i]+n>90)){
                    answer+=(char)(str[i]+n-26)+"";
                }else if((str[i]>=97 && str[i]<=122) && (str[i]+n>122)){
                    answer+=(char)(str[i]+n-26)+"";
                }else{
                    answer+=(char)(str[i]+n)+"";
                }
            }
        }
        return answer;
    }
}