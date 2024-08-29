class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length*k];
        int idx = 0;
        for(int i=0; i<answer.length; i++){
            answer[i] = "";
            if(i!=0 && i%k!=0){
                answer[i] = answer[i-1];
            }else{
                for(int j=0; j<picture[idx].length(); j++){
                    for(int l=0; l<k; l++){
                        answer[i]+=picture[idx].charAt(j);
                    }
                }
                idx++;
            }
        }
        return answer;
    }
}