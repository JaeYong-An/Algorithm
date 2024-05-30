class Solution {
    public String solution(String my_string, String alp) {
        String answer = "";
        String str[] = my_string.split("");
        for(int i=0; i<str.length; i++){
            if(str[i].equals(alp)){
                str[i]=(char)(str[i].charAt(0)-32)+"";
            }
            answer+=str[i];
        }
        return answer;
    }
}