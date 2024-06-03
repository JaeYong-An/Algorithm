class Solution {
    public int[] solution(String myString) {
        int size = 1;
        for(int i=0; i<myString.length(); i++){
            if(myString.charAt(i)=='x'){
                size++;
            }
        }
        int answer[] = new int[size];
        int idx = 0;
        for(int i=0; i<myString.length(); i++){
            if(myString.charAt(i)=='x'){
                idx++;
            }else{
                answer[idx]++;
            }
        }
        return answer;
    }
}