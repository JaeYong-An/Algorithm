class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        String str[] = my_string.split("");
        for(int i=0; i<str.length; i++){
            if(i*m+c-1<str.length){
                answer+=str[i*m+c-1];
            }else{
                break;
            }
        }
        return answer;
    }
}