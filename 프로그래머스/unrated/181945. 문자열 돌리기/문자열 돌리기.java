import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        if (1 > a.length() || a.length() > 10) {
            System.out.println("문자열은 1자리이상 10자리이하로 작성해주세요.");
            System.exit(0);
        }

        for (int i = 0; i < a.length(); i++) {
            System.out.println(a.charAt(i));
        }
    }
}