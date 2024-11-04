import java.util.*;
class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        int cnt=0;
        for(int i=0; i<attendance.length; i++){
            if(attendance[i]==true){
                cnt++;
            }
        }
        int att_list[][]=new int[cnt][2];
        int idx=0;
        for(int i=0; i<attendance.length; i++){
            if(attendance[i]==true){
                att_list[idx][0]=rank[i];
                att_list[idx][1]=i;
                idx++;
            }
        }
        Arrays.sort(att_list, new Comparator<int[]>(){
            
            @Override
            public int compare(int[] o1, int[] o2){
                return o1[0] - o2[0];
            }
        });
        answer=10000*att_list[0][1]+100*att_list[1][1]+att_list[2][1];
        return answer;
    }
}