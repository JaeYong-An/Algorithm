class Solution {
    public String solution(String s) {
        String answer = "";
        String str[] = s.split(" ");
        int small = Integer.parseInt(str[0]);
        int big = Integer.parseInt(str[0]);
        for(int i=0; i<str.length; i++){
            if(small>Integer.parseInt(str[i])){
                small = Integer.parseInt(str[i]);
            }
            if(big<Integer.parseInt(str[i])){
                big = Integer.parseInt(str[i]);
            }
        }
        answer = small+" "+big;
        return answer;
    }
}