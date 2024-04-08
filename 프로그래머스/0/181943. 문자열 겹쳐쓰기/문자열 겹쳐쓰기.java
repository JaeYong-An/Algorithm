class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = my_string;
        String str1 = answer.substring(0,s);
        String str2 = answer.substring(s+overwrite_string.length());
        answer = str1+overwrite_string+str2;
        return answer;
    }
}