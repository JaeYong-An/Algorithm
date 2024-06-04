class Solution {
    public String solution(String s) {
        String answer = "";
        String str[] = s.split("");
        int idx = 0;
        for(int i=0; i<str.length; i++){
            if(idx%2==0){
                answer+=str[i].toUpperCase();
            }else{
                answer+=str[i].toLowerCase();
            }
            idx++;
            if(str[i].equals(" ")){
                idx = 0;
            }
        }
        return answer;
    }
}