class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        int idx = strArr.length;
        for(int i=1; i<=30; i++){
            int cnt = 0;
            for(int j=0; j<strArr.length; j++){
                if(strArr[j].length()==i){
                    cnt++;
                    idx--;
                }
            }
            if(cnt>answer){
                answer = cnt;
            }
            if(idx==0){
                break;
            }
        }
        return answer;
    }
}