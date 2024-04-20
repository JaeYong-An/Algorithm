class Solution {
    public int solution(int slice, int n) {
        int answer = 0;
        int eat = 0;
        int pizza = slice;
        while(true){
            eat = pizza/n;
            answer ++;
            if(eat>=1){
                break;
            }
            pizza += slice;
        }
        return answer;
    }
}