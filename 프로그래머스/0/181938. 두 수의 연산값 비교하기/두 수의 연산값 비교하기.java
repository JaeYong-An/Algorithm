class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int num = Integer.parseInt(""+a+b);
        return num>=a*b*2 ? num:a*b*2;
    }
}