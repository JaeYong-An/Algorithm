class Solution {
    public int solution(String[] friends, String[] gifts) {
        int answer = 0;
        int[] giftInt = new int[friends.length];
        String[][] friends1 = new String[friends.length+1][friends.length+1];
        //friends1[0][0] = "↓준 사람 \\ 받은 사람→";
        int takeGift[] = new int[friends.length];
        for(int i = 0; i<friends.length; i++){
            friends1[i+1][0] = friends[i];
            friends1[0][i+1] = friends[i];
        }
        for(int i = 0; i<friends.length; i++) {
        	for(int j = 0; j<friends.length; j++) {
        		friends1[i+1][j+1] = "0";
                friends1[i+1][i+1] = "-";
        	}
        }
        for(int i = 0; i<gifts.length; i++){
            String str[] = gifts[i].split(" ");
            for(int j = 0; j<friends.length; j++){
                if(friends[j].equals(str[0])){
                    giftInt[j] ++;
                }
                if(friends[j].equals(str[1])){
                    giftInt[j] --;
                }
            }
        }
        for(int i = 0; i<gifts.length; i++) {
        	String str[] = gifts[i].split(" ");
        	int giver = 0;
        	int taker = 0;
        	for(int j = 1; j<friends1.length; j++) {
        		if(str[0].equals(friends1[j][0])) {
        			giver = j;
        		}
        	}
        	for(int k = 1; k<friends1.length; k++) {
        		if(str[1].equals(friends1[0][k])) {
        			taker = k;
        		}        			
        	}
			int gift= Integer.parseInt(friends1[giver][taker]);
			friends1[giver][taker] = (gift+1)+"";
        }
        for(int i = 1; i<friends1.length; i++) {
        	for(int j = 1; j<friends1.length; j++) {
        		if(i!=j) {
        			if(Integer.parseInt(friends1[i][j]) > Integer.parseInt(friends1[j][i])) {
        				takeGift[i-1] ++;
        			}
        			else if(Integer.parseInt(friends1[i][j]) == Integer.parseInt(friends1[j][i])) {
        				if(giftInt[i-1]>giftInt[j-1]) {
        					takeGift[i-1] ++;
        				}
        			}
        		}
        	}
        	
        }
        for(int i = 0; i<friends1.length; i++) {
        	for(int j = 0; j<friends1.length; j++) {
        		System.out.print(friends1[i][j]+" ");
        	}
        	System.out.println();
        }
        for(int i = 0; i<takeGift.length; i++) {
        	System.out.print(takeGift[i] + " ");
        }
        for(int i = 0; i<giftInt.length; i++) {
        	System.out.print(giftInt[i] + " ");
        }
        for(int i = 0; i<takeGift.length; i++) {
        	if(answer<takeGift[i]) {
    			answer = takeGift[i];
    		}
        }
        return answer;
    }
}