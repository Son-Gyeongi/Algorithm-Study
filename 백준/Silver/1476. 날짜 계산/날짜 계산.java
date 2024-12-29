import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int E = sc.nextInt();
        int S = sc.nextInt();
        int M = sc.nextInt();
        
        int count = 1;
        while(true) {
            int e = count%15 == 0 ? 15 : count%15;
            int s = count%28 == 0 ? 28 : count%28;
            int m = count%19 == 0 ? 19 : count%19;
            
            if (e == E && s == S && m == M) break;
            count++;
        }
        
        System.out.println(count);
    }
}