class Solution {
    public String solution(String myString, String pat) {
        String answer = "";
        for(int i=0; i<myString.length()-pat.length()+1; i++){
            String str = myString.substring(i,i+pat.length());
            if(str.equals(pat)){
                answer = myString.substring(0,i+pat.length());
            }
        }
        return answer;
    }
}