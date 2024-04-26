class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String bab[] = {"aya", "ye", "woo", "ma"};
        for(int i=0; i<babbling.length; i++){
            String str = babbling[i];
            for(int j=0; j<bab.length; j++){
                if(str.length()>=bab[j].length() && (str.substring(0,bab[j].length())).equals(bab[j])){
                    if(str.length()==bab[j].length()){
                        answer++;
                        break;
                    }else{
                        str = str.substring(bab[j].length());
                        j=-1;
                    }
                }
            }
        }
        return answer;
    }
}