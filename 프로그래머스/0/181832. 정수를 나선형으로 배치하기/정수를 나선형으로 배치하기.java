class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int num = 0;
        int angle = 0;
        int index = n;
        while(num<n*n){
            for(int i = angle; i<index; i++){
                answer[angle][i] = num+1;
                num++;
                if(i==index-1){
                    for(int j = angle+1; j<index; j++){
                        answer[j][index-1] = num+1;
                        num++;
                        if(j==index-1){
                            for(int k = index-1; k>angle; k--){
                                answer[index-1][k-1] = num+1;
                                num++;
                                if(k==angle+1){
                                    for(int l = index-1; l>angle+1; l--){
                                        answer[l-1][angle] = num+1;
                                        num++;
                                    }
                                    index--;
                                    angle++;
                                }
                            }
                        }
                    }
                }
            }
        }
        return answer;
    }
}