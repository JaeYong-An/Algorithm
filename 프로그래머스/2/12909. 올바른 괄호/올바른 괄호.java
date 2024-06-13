class Solution {
    boolean solution(String s) {
        boolean answer = true;
        String str[] = s.split("");
        if(str[0].equals(")")){
            return false;
        }
        int check = 0;
        for(int i=0; i<str.length; i++){
            if(str[i].equals("(")){
                check++;
            }else{
                check--;
            }
            if(check<0){
                return false;
            }
        }
        return check==0? true:false;
    }
}