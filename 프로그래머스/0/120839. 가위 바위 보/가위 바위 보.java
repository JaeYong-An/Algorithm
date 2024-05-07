class Solution {
    public String solution(String rsp) {
        String answer = "";
        String str[] = rsp.split("");
        for(int i=0; i<str.length; i++){
            if(str[i].equals("0")){
                str[i]="5";
            }else if(str[i].equals("2")){
                str[i]="0";
            }else{
                str[i]="2";
            }
            answer+=str[i];
        }
        return answer;
    }
}