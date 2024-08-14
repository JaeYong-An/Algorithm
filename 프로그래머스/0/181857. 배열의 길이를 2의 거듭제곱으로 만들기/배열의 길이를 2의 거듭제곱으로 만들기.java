class Solution {
    public int[] solution(int[] arr) {
        int size = arr.length;
        for(int i=0; ;i++){
            int num = (int)Math.pow(2,i);
            if(size<=num){
                size = num;
                break;
            }
        }
        int[] answer = new int[size];
        for(int i=0; i<arr.length; i++){
            answer[i] = arr[i];
        }
        return answer;
    }
}