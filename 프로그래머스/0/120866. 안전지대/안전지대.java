class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        int area[][] = new int[board.length][board[0].length];
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[i].length; j++){
                if(board[i][j]==1){
                    if(i>0){
                        area[i-1][j]++;
                    }
                    if(j>0){
                        area[i][j-1]++;
                    }
                    if(i>0&&j>0){
                        area[i-1][j-1]++;
                    }
                    if(i>0&&j<board[i].length-1){
                        area[i-1][j+1]++;
                    }
                    if(j<board[i].length-1){
                        area[i][j+1]++;
                    }
                    if(i<board.length-1&&j>0){
                        area[i+1][j-1]++;
                    }
                    if(i<board.length-1){
                        area[i+1][j]++;
                    }
                    if(i<board.length-1&&j<board[i].length-1){
                        area[i+1][j+1]++;
                    }
                    area[i][j]++;
                }
            }
        }
        for(int i=0; i<area.length; i++){
            for(int j=0; j<area[i].length; j++){
                if(area[i][j]==0){
                    answer++;
                }
            }
        }
        return answer;
    }
}