class Solution {
    public int solution(int n) {
        int answer = 0;
        String str = "";
        while(n>0){
            str+=n%3+"";
            n/=3;
        }
        int three = 1;
        for(int i=str.length()-1; i>=0; i--){
            answer+=(str.charAt(i)-'0')*three;
            three*=3;
        }
        return answer;
    }
}