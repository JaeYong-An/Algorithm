class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean answer = false;
        boolean a1 = false;
        boolean a2 = false;
        if(x1 || x2){
            a1 = true;
        }
        if(x3 || x4){
            a2 = true;
        }
        if(a1 && a2){
            answer = true;
        }
        return answer;
    }
}