class Solution {
    public String[] solution(String my_str, int n) {
        int size = my_str.length();
        String[] answer = size%n==0 ? new String[size/n]:new String[size/n+1];
        String str[] = my_str.split("");
        String slice = "";
        int idx = 0;
        for(int i=0; i<str.length; i++){
            slice+=str[i];
            if(slice.length()==n){
                answer[idx]=slice;
                idx++;
                slice = "";
            }else if(i==str.length-1){
                answer[idx]=slice;
            }
        }
        return answer;
    }
}