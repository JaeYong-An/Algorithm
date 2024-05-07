class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String str[] = my_string.split("");
        for(int i=0; i<str.length; i++){
            if(str[i].charAt(0)>=48 && str[i].charAt(0)<=57){
                answer+=Integer.parseInt(str[i]);
            }
        }
        return answer;
    }
}