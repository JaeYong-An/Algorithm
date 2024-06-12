class Solution {
    public String solution(String myString) {
        String answer = "";
        String st = myString.toLowerCase();
        for(int i=0; i<st.length(); i++){
            char ch = st.charAt(i);
            if(ch=='a'){
                ch='A';
            }
            answer+=ch+"";
        }
        return answer;
    }
}