class Solution {
    public String[] solution(String[] strArr) {
        int hasAd = 0;
        for(int i=0; i<strArr.length; i++){
            if(strArr[i].contains("ad")){
                hasAd++;
            }
        }
        String[] answer = new String[strArr.length-hasAd];
        int idx = 0;
        for(int i=0; i<strArr.length; i++){
            if(!strArr[i].contains("ad")){
                answer[idx] = strArr[i];
                idx++;
            } 
        }
        return answer;
    }
}