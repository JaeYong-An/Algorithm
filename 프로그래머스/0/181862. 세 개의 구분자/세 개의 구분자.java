class Solution {
    public String[] solution(String myStr) {
        String[] answer = {};
        myStr = myStr.replaceAll("a|b|c"," ");
        String list[] = myStr.split("\\s+");
        int size = 0;
        for(int i=0; i<list.length; i++){
            if(!list[i].equals("")){
                size++;
            }
        }
        if(size==0){
            answer = new String[1];
            answer[0] = "EMPTY";
            return answer;
        }
        answer = new String[size];
        int idx = 0;
        for(int i=0; i<list.length; i++){
            if(!list[i].equals("")){
                answer[idx] = list[i];
                idx++;
            }
        }
        return answer;
    }
}