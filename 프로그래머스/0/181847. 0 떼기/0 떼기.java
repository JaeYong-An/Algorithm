class Solution {
    public String solution(String n_str) {
        String answer = "";
        boolean trigger = false;
        for(int i=0; i<n_str.length(); i++){
            if(n_str.charAt(i)!='0'){
                trigger = true;
            }
            if(trigger){
                answer+=""+n_str.charAt(i);
            }
        }
        return answer;
    }
}