class Solution {
    public String[] solution(String my_string) {
        int size = 0;
        String sizeWord = "";
        for(int i=0; i<my_string.length(); i++){
            if(my_string.charAt(i)==' '){
                if(sizeWord!=""){
                    size++;
                }
                sizeWord="";
            }else if(i==my_string.length()-1){
                sizeWord+=my_string.charAt(i)+"";
                if(sizeWord!=""){
                    size++;
                }
            }else{
                sizeWord+=my_string.charAt(i)+"";
            }
        }
        String answer[] = new String[size];
        String word = "";
        int idx = 0;
        for(int i=0; i<my_string.length(); i++){
            if(my_string.charAt(i)==' '){
                if(word!=""){
                    answer[idx] = word;
                    idx++;
                }
                word="";
            }else if(i==my_string.length()-1){
                word+=my_string.charAt(i)+"";
                answer[idx] = word;
            }else{
                word+=my_string.charAt(i)+"";
            }
        }
        return answer;
    }
}