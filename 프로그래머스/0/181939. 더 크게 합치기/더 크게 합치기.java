class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String num1 = Integer.toString(a);
        String num2 = Integer.toString(b);
        if(Integer.parseInt(num1+num2)>=Integer.parseInt(num2+num1)){
            answer = Integer.parseInt(num1+num2);
        }else{
            answer = Integer.parseInt(num2+num1);
        }
        return answer;
    }
}