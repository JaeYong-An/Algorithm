class Solution {
    public String solution(String polynomial) {
        String answer = "";
        int xNum = 0;
        int num = 0;
        String str[] = polynomial.split(" ");
        for(int i=0; i<str.length; i=i+2){
            if(str[i].contains("x")){
                if(str[i].length()==1){
                    xNum++;
                }else{
                    xNum += Integer.parseInt(str[i].substring(0,str[i].indexOf("x")));
                }
            }else{
                num += Integer.parseInt(str[i]);
            }
        }
        if(num==0){
            if(xNum>1){
                answer = xNum + "x";
            }else{
                answer = "x";
            }
        }else if(xNum==0){
            answer = num+"";
        }else{
            if(xNum>1){
                answer = xNum + "x + " + num;
            }else{
                answer = "x + " + num;
            }
        }
        return answer;
    }
}