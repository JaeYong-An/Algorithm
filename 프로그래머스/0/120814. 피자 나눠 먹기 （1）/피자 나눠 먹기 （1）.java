class Solution {
    public int solution(int n) {
        int answer = 0;
        int eat = 0;
        int pizza = 7;
        while(true){
            eat = pizza/n;
            answer ++;
            if(eat>=1){
                break;
            }
            pizza += 7;
        }
        return answer;
    }
}