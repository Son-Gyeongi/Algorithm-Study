import java.util.*;

public class Main {
    public static int n;
    public static int[][] arr;
    public static List<Integer> list = new ArrayList<>();
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n][n];
        int max = 0;
        
        for (int i=0;i<n;i++) {
            for (int j=0;j<n;j++) {
                arr[i][j] = Integer.parseInt(sc.next());
                max = Math.max(max, arr[i][j]);
            }
        }
        
        for (int r=0;r<max;r++) {
            int count = 0;
            // 매번 물에 잠기는 범위를 새롭게 하기 때문에 boolean 선언이 for문 안에 있다.
            // 이미 탐색한 곳 제외
            boolean[][] bool = new boolean[n][n];
            
            for (int i=0;i<n;i++) {
                for (int j=0;j<n;j++) {
                    // r 범위보다 초과하는 경우 탐색
                    if (r < arr[i][j] && bool[i][j] == false) {
                        dfs(i, j, r, bool);
                        count++;
                    }
                }
            }
            
            list.add(count);
        }
        
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list.get(0));
    }
    
    // 반환값은 나중에 생각해보기
    public static void dfs(int x, int y, int range, boolean[][] bool) {
        if (x < 0 || x >= n || y < 0 || y >= n) return;
        if (range >= arr[x][y] || bool[x][y] == true) return;
        bool[x][y] = true;
        dfs(x-1,y,range,bool);
        dfs(x+1,y,range,bool);
        dfs(x,y-1,range,bool);
        dfs(x,y+1,range,bool);
    }
}