import java.util.*;

public class Main {
    public static List<Integer> list = new ArrayList<>();
    public static int[][] link;
    public static int n;
    public static boolean[] check;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); // 도시 수
        link = new int[n+1][n+1]; // 도시간 경로 비용
        check = new boolean[n+1]; // 방문한 도시 표시
        
        for (int i=1;i<link.length;i++) {
            for (int j=1;j<link[i].length;j++) {
                link[i][j] = sc.nextInt();
            }
        }
        
        for (int i=1;i<=n;i++) {
            dfs(i, 0, 1, i); // 출발 도시, 비용 합계, 도시 카운트, 출발이자 목적지 도시(고정)
        }
        
        Collections.sort(list);
        System.out.println(list.get(0));
    }
    
    public static void dfs(int city, int expense, int count, int fixCity) {
        if (count == n) {
        	if (link[city][fixCity] != 0) list.add(expense+link[city][fixCity]);
            return;
        }
        
        for (int j=1;j<link[city].length;j++) {
            if (city != j && check[j] == false && link[city][j] != 0) {
                check[city] = true;
                dfs(j, expense+link[city][j], count+1, fixCity);
                check[city] = false;
            }
        }
    }
}