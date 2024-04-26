class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        int i, idx;
        for(i = num_list.length-1, idx=0; i>=0; i--, idx++){
            answer[idx] = num_list[i];
        }
        return answer;
    }
}