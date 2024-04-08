import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String str[] = a.split("");
        for(int i = 0; i<str.length; i++){
            if(str[i].charAt(0) >= 97 && str[i].charAt(0) <= 122){
                System.out.print((char)(str[i].charAt(0)-32));    
            }else{
                System.out.print((char)(str[i].charAt(0)+32));
            }
        }
    }
}