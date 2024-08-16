class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        int patLen = pat.length();
        for(int i=0; i<myString.length()-patLen+1; i++){
            String str = myString.substring(i,i+patLen);
            if(str.equals(pat)){
                answer++;
            }
        }
        return answer;
    }
}