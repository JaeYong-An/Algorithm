class Solution {
    public int[] solution(int n, int[] numlist) {
        int idx = 0;
        for(int i=0; i<numlist.length; i++){
            if(numlist[i]%n==0){
                idx++;
            }
        }
        int[] answer = new int[idx];
        int insert=0;
        for(int i=0; i<numlist.length; i++){
            if(numlist[i]%n==0){
                answer[insert]=numlist[i];
                insert++;
            }
        }
        return answer;
    }
}