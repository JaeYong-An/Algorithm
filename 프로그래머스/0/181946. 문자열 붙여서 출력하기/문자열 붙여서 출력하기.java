import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        String str1[] = a.split(" ");
        String str2[] = b.split(" ");
        for(int i = 0; i<str1.length; i++){
            System.out.print(str1[i]);    
        }
        for(int i = 0; i<str2.length; i++){
            System.out.print(str2[i]);    
        }
    }
}