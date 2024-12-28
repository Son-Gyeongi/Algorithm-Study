import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strArr = new String[15];
        
        for (int i=0;i<strArr.length;i++) strArr[i] = "";
        
        for (int i=0;i<5;i++) {
            String[] input = sc.next().split("");
            
            for (int j=0;j<input.length;j++) strArr[j] += input[j];
        }
        
        System.out.println(String.join("", strArr));
    }
}