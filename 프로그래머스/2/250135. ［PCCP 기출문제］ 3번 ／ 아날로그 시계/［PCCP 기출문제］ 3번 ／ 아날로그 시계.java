class Solution {
    public int solution(int h1, int m1, int s1, int h2, int m2, int s2) {
        int answer = 0;
        double hh = (double)h1;
        double mm = (double)m1;
        boolean trigger = false;
        int minuteRepeat = 1;
        int hourRepeat = 1;
        for(int i = s1; i<=60; i++){
            if(i==60){
                i=0;
                mm=m1+minuteRepeat;
                minuteRepeat++;
            }
            if(mm>=60) {
            	mm = mm%60;
            }
            if(!trigger){
                mm+=(double)i/60;
                hh+=(double)mm/60;
                if(mm==0 && i==0){
                    answer++;
                }
                if((hh==0 || hh==12) && i==0 && mm==0){
                    answer++;
                }
                trigger = true;
            }else if(trigger){
            	double am = (double)1/60;
            	double ah = (double)am/60;
            	if(i!=0) {
            		mm+=am;                	
            	}
                if(mm==0){
                	hh = h1+hourRepeat;
                	hourRepeat++;
                    answer++;
                }else if(mm!=0) {
                	hh+=ah;                	                	
                }
                if(i>0) {
                	if(i-1<mm-am && mm<i) {
                		answer++;
                	}
                	if(hh<12 && (i-1<(hh-ah)*5 && hh*5<i)) {
                		answer++;
                	}else if(hh>=12 && (i-1<((hh-12.0)-ah)*5 && (hh-12.0)*5<i)) {
                		answer++;
                	}
                }else if(i==0) {
                	if(59<mm-am && mm<60) {
                		answer++;
                	}
                	if(hh<12 && (59<(hh-ah)*5 && hh*5<60)) {
                		answer++;
                	}else if(hh>=12 && (59<((hh-12.0)-ah)*5 && (hh-12.0)*5<60)) {
                		answer++;
                	}else if(hh==12 && mm==0){
                        answer++;
                    }
                }
            }
            if((hh==0 || hh==12) && mm==0 && i==0) {
            	answer--;
            }
            if((int)hh==h2 && (int)mm==m2 && i==s2){
            	break;
            }
        }
        return answer;
    }
}