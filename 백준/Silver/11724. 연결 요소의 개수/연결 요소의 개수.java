import java.util.*;

public class Main {
    public static int[][] connect;
    public static boolean[] visited;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        connect = new int[n+1][n+1];
        visited = new boolean[n+1];
        for (int i=0;i<m;i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            
            connect[u][v] = connect[v][u] = 1;
        }
        
        int count = 0;
        for (int i=1;i<visited.length;i++) {
            if (visited[i] == false) {
                dfs(i);
                count++;
            }
        }
        
        System.out.println(count);
    }
    
    public static void dfs(int start) {
		    visited[start] = true;
		           
        for (int i=0;i<connect[0].length;i++) {
            if (connect[start][i] == 1 && visited[i] == false) dfs(i);
        }
    }
}