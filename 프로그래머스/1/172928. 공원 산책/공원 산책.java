class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] answer = new int[2];
        int row=0, column=0;
        int rowSize = park[0].length();
        int columnSize=park.length;
        a: for(int i=0; i<park.length; i++){
            String rc[] = park[i].split("");
            for(int j=0; j<rc.length; j++){
                if(rc[j].equals("S")){
                    row=j;
                    column=i;
                    break a;
                }
            }
        }
        for(int i=0; i<routes.length; i++){
            String move[] = routes[i].split(" ");
            int originRow = row;
            int originColumn = column;
            switch(move[0]){
                case "E":
                    if(row+Integer.parseInt(move[1])<rowSize){
                        String check[] = park[column].split("");
                        boolean go = true;
                        for(int j=originRow+1; j<=row+Integer.parseInt(move[1]); j++){
                            if(check[j].equals("X")){
                                go = false;
                                break;
                            }
                        }
                        if(go) {
                            row+=Integer.parseInt(move[1]);                        	
                        }
                    }
                    break;
                case "W":
                    if(row-Integer.parseInt(move[1])>=0){
                        String check[] = park[column].split("");
                        boolean go = true;
                        for(int j=originRow-1; j>=row-Integer.parseInt(move[1]); j--){
                            if(check[j].equals("X")){
                                go = false;
                                break;
                            }
                        }
                        if(go) {
                            row-=Integer.parseInt(move[1]);                    	
                        }
                    }
                    break; 
                case "S":
                    if(column+Integer.parseInt(move[1])<columnSize){
                        boolean go = true;
                        for(int j=originColumn+1; j<=column+Integer.parseInt(move[1]); j++){
                            if(park[j].charAt(row)=='X'){
                                go=false;
                                break;
                            }
                        }
                        if(go) {
                            column+=Integer.parseInt(move[1]);                    	
                        }
                    }
                    break;
                case "N":
                    if(column-Integer.parseInt(move[1])>=0){
                        boolean go = true;
                        for(int j=originColumn-1; j>=column-Integer.parseInt(move[1]); j--){
                            if(park[j].charAt(row)=='X'){
                                go=false;
                                break;
                            }
                        }
                        if(go) {                    	
                            column-=Integer.parseInt(move[1]);
                        }
                    }
                    break;
                default:break;
            }
        }
        answer[1] = row;
        answer[0] = column;
        return answer;
    }
}