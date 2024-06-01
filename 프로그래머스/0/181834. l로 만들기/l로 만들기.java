class Solution {
    public String solution(String myString) {
        String answer = "";
        String str[] = myString.split("");
        for(int i=0; i<str.length; i++){
            if(str[i].charAt(0)<108){
                str[i] = (char)108+"";
            }
            answer+=str[i];
        }
        return answer;
    }
}