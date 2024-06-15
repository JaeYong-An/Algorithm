class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        String str[] = s.split("");
        for(int i=0; i<str.length; i++){
            int check = 0;
            for(int j=0; j<i; j++){
                if(str[i].equals(str[j])){
                    check = i-j;
                }
            }
            answer[i] = check==0? -1:check;
        }
        return answer;
    }
}