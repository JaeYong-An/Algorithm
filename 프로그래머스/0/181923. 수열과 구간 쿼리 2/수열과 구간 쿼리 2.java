class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        int idx = 0;
        for(int i=0; i<queries.length; i++){
            int num = -1;
            for(int j=queries[i][0]; j<=queries[i][1]; j++){
                if(num==-1 && arr[j]>queries[i][2]){
                    num = arr[j];
                }else if(arr[j]>queries[i][2] && num>arr[j]){
                    num = arr[j];
                }
            }
            answer[idx] = num;
            idx++;
        }
        return answer;
    }
}