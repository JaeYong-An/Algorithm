class Solution {
    public int solution(int order) {
        int answer = 0;
        String str = Integer.toString(order);
        str = str.replaceAll("[369]","x");
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)=='x'){
                answer++;
            }
        }
        return answer;
    }
}