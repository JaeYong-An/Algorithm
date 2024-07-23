class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "";
        int state = 0;
        for(int i=0; i<db.length; i++){
            boolean id = false;
            boolean pw = false;
            if(!id && db[i][0].equals(id_pw[0])){
                id = true;
            }
            if(id && db[i][1].equals(id_pw[1])){
                pw = true;
            }
            if(id && pw){
                state = 2;
            }else if(id && !pw){
                state = 1;
            }
        }
        if(state == 2){
            answer+="login";
        }else if(state == 1){
            answer+="wrong pw";
        }else{
            answer+="fail";
        }
        return answer;
    }
}