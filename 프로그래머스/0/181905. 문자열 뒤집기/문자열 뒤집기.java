class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        String str[] = my_string.split("");
        for(int i=0; i<str.length; i++){
            if(i==s){
                for(int j=e; j>=s; j--){
                    answer+=str[j];
                    i++;
                }
                i--;
            }else{
                answer+=str[i];
            }
        }
        return answer;
    }
}