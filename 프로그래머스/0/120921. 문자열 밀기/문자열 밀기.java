class Solution {
    public int solution(String A, String B) {
        int answer = -1;
        String strB[] = B.split("");
        for(int i=0; i<strB.length; i++){
            String rotate = "";
            int idx = i;
            int cnt = 0;
            while(cnt!=strB.length){
                rotate+=strB[idx];
                idx++;
                if(idx==strB.length){
                    idx = 0;
                }
                cnt++;
            }
            if(rotate.equals(A)){
                answer = i;
                break;
            }
        }
        return answer;
    }
}