class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        while(true){
            String str[] = s.split("");
            s = "";
            for(int i=0; i<str.length; i++){
                if(str[i].equals("0")){
                    answer[1]++;
                }else{
                    s+=str[i];
                }
            }
            answer[0]++;
            if(s.equals("1")){
                break;
            }
            s = bin(s.length());
        }
        return answer;
    }
    
    public String bin(int n){
        String s = "";
        while(n!=0){
            if(n%2==0){
                s+="0";
            }else{
                s+="1";
            }
            n/=2;
        }
        return s;
    }
}