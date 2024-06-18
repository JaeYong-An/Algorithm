class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        for(int i=0; i<n; i++){
            answer[i] = "";
            for(int j=n-1; j>=0; j--){
                int bin = (int)Math.pow(2,j);
                boolean trigger = false;
                if(arr1[i]<bin && arr2[i]<bin){
                    answer[i] += " ";
                }else{
                    if(arr1[i]/bin>=1){
                        answer[i] += "#";
                        arr1[i] -= bin;
                        trigger = true;
                    }
                    if(arr2[i]/bin>=1){
                        if(!trigger){
                            answer[i] += "#";
                            trigger = true;
                        }
                        arr2[i] -= bin;
                    }
                    if(!trigger){
                        answer[i] += " ";
                    }
                }
            }
        }
        return answer;
    }
}