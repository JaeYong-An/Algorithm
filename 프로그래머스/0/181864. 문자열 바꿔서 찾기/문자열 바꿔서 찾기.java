class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String myStr = "";
        String str[] = myString.split("");
        for(int i=0; i<str.length; i++){
            if(str[i].equals("A")){
                myStr+="B";
            }else{
                myStr+="A";
            }
        }
        if(myStr.contains(pat)){
            answer=1;
        }
        return answer;
    }
}