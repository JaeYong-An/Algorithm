class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        int len = my_string.length()-n;
        int max = my_string.length();
        for(int i=len; i<max; i++){
            answer+=my_string.charAt(i)+"";
        }
        return answer;
    }
}