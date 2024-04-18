import java.util.Arrays;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        int reportInt[] = new int[id_list.length];
        Arrays.sort(report);
        for(int i = 0; i<report.length; i++){
            String name[] = report[i].split(" ");
            if(i==0 || (i!=0 && !report[i].equals(report[i-1]))) {
            	for(int j = 0; j<id_list.length; j++){
            		if(name[1].equals(id_list[j])){
            			reportInt[j] ++;
            			break;
            		}
            	}            	
            }
        }
        for(int i = 0; i<report.length; i++) {
        	String name[] = report[i].split(" ");
        	if(i==0 || (i!=0 && !report[i].equals(report[i-1]))) {
        		if(reportInt[Arrays.asList(id_list).indexOf(name[1])]>=k) {
        			answer[Arrays.asList(id_list).indexOf(name[0])]++;        			
        		}
            }
        }
        return answer;
    }
}