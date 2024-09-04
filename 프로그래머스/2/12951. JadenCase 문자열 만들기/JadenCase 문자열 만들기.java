class Solution {
    public String solution(String s) {
        String answer = "";
        String str[] = s.split("");
        for(int i=0; i<str.length; i++){
            if(i==0 || str[i-1].equals(" ")){
                String first = (char)str[i].charAt(0)+"";
                answer += first.toUpperCase();
            }else{
                String other = (char)str[i].charAt(0)+"";
                answer += other.toLowerCase();
            }
        }
        return answer;
    }
}