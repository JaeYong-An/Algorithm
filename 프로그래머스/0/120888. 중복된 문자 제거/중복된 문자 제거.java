class Solution {
    public String solution(String my_string) {
        String answer = "";
        String myString[] = my_string.split("");
        for(int i=0; i<myString.length; i++){
            boolean check=true;
            String str[] = answer.split("");
            for(int j=0; j<str.length; j++){
                if(myString[i].equals(str[j])){
                    check=false;
                    break;
                }
            }
            if(check){
                answer+=myString[i];
            }
        }
        return answer;
    }
}