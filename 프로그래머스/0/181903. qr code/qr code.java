class Solution {
    public String solution(int q, int r, String code) {
        String answer = "";
        String str[] = code.split("");
        for(int i=r; i<str.length; i=i+q){
            answer+=str[i];
        }
        return answer;
    }
}