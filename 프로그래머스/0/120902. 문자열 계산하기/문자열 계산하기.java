class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String str[] = my_string.split(" ");
        int num1 = Integer.parseInt(str[0]);
        int num2 = 0;
        String op = "";
        for(int i=0; i<str.length; i++){
            if(i%2==1){
                op = str[i];
            }else{
                num2 = Integer.parseInt(str[i]);
                if(op.equals("+")){
                    num1 = num1 + num2;
                }else if(op.equals("-")){
                    num1 = num1 - num2;
                }
            }
            answer = num1;
        }
        
        return answer;
    }
}