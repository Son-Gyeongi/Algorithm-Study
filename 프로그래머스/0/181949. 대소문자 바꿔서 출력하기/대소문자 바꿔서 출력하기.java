import java.util.Scanner;

public class Solution1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        String[] strArr = a.split("");
        char[] charArr = a.toCharArray();

        for (int i=0;i<charArr.length;i++) {
            if ('a' <= charArr[i] && charArr[i] <= 'z') {
                strArr[i] = strArr[i].toUpperCase();
            } else {
                strArr[i] = strArr[i].toLowerCase();
            }
        }

        System.out.println(String.join("", strArr));
    }
}