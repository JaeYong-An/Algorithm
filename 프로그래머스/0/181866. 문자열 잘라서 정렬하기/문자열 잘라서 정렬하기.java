import java.util.*;

class Solution {
    public String[] solution(String myString) {
        List<String> list = new ArrayList<>();
        // String str = "";
        // for(int i=0; i<myString.length(); i++){
        //     if(!str.equals("") && myString.charAt(i)=='x'){
        //         list.add(str);
        //         str = "";
        //     }else if(!str.equals("") && i==myString.length()-1){
        //         str+=myString.charAt(i)+"";
        //         list.add(str);
        //     }else if(myString.charAt(i)!='x'){
        //         str+=myString.charAt(i)+"";
        //     }
        // }
        // String answer[] = new String[list.size()];
        // for(int i=0; i<answer.length; i++){
        //     answer[i] = list.get(i);
        // }
        String str[] = myString.split("x");
        for(int i=0; i<str.length; i++){
            if(!str[i].equals("")){
                list.add(str[i]);
            }
        }
        String answer[] = new String[list.size()];
        for(int i=0; i<answer.length; i++){
            answer[i] = list.get(i);
        }
        Arrays.sort(answer);
        return answer;
    }
}