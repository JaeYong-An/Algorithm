class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        String str[] = my_string.split("");
        for(int i=0; i<str.length; i++){
            boolean flag = true;
            for(int j=0; j<indices.length; j++){
                if(i==indices[j]){
                    flag = false;
                    break;
                }
            }
            if(flag){
                answer+=str[i];
            }
        }
        return answer;
    }
}