import java.util.*;

public class Main {
    public static int[][] connect;
    public static int N, M, V;
    // dfs 에서 사용
    public static StringBuffer dfsAns = new StringBuffer();
    public static int[] visited;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt(); // 정점의 개수
        M = sc.nextInt(); // 간선의 개수
        V = sc.nextInt(); // 시작 정점의 번호
        connect = new int[N+1][N+1];
        
        for (int i=0;i<M;i++) {
            int c1 = sc.nextInt();
            int c2 = sc.nextInt();
            connect[c1][c2] = connect[c2][c1] = 1;
        }
        
        visited = new int[N+1]; // dfs 에서 사용
        dfs(V);
        String bfsAns = bfs();
        
        System.out.println(dfsAns.toString().trim());
        System.out.println(bfsAns.trim());
    }
    
    // 깊이 우선 탐색
    public static void dfs(int v) {      
        dfsAns.append(v).append(" ");
        visited[v] = 1;
        for (int i=0;i<connect.length;i++) {
            if (visited[i] == 0 && connect[v][i] > 0) {
                visited[i] = 1;
                dfs(i);
            }
        }
        
        return; // 더이상 방문할 곳이 없는 경우
    }
    
    // 너비 우선 탐색
    public static String bfs() {
        StringBuffer sb = new StringBuffer();
        int[] visited = new int[N+1];
        Queue<Integer> queue = new LinkedList<>();
        
        // 시작할 정점
        queue.offer(V);
        visited[V] = 1; // 이미 방문한 곳은 제외
        sb.append(V).append(" ");
        
        while (!queue.isEmpty()) {
            int node = queue.poll();
            
            for (int i=0;i<connect.length;i++) {
                // 방문하지 않은 곳 && 연결된 정점
                if (visited[i] == 0 && connect[node][i] > 0) {
                    queue.offer(i);
                    visited[i] = 1; // node 에 연결된 정점 방문
                    sb.append(i).append(" ");
                }
            }
        }
        
        return sb.toString();
    }
}