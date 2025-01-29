import java.util.*;

public class Main {
    public static List<Integer> list = new ArrayList<>();
    public static int p, dupl;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        p = sc.nextInt();
        
        dfs(a);
        
        // dupl 중복되는 곳부터 list에서 삭제
        int index = list.indexOf(new Integer(dupl));
        List<Integer> newList = list.subList(0, index);
        
        System.out.println(newList.size());
    }
    
    public static void dfs(int a) {
        if (list.contains(a)) {
            dupl = a;
            return;
        }
        list.add(a);
        
        int sum = 0;
        while (a > 0) {
            int num = a%10;
            sum += (int)Math.pow(num, p);
            a /= 10;
        }
        
        dfs(sum);
    }
}