class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        String str[] = my_string.split("");
        for(int i=0; i<str.length; i++){
            int c = str[i].charAt(0);
            if(c>=65 && c<=90){
                answer[c-65]++;
            }else{
                answer[c-71]++;
            }
        }
        return answer;
    }
}