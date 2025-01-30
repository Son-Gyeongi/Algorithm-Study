import java.util.*;

public class Main {
    public static int[][] house;
    public static int n;
    public static int[] dx = {-1,1,0,0};
    public static int[] dy = {0,0,-1,1};
    
    public static void main(String[] args) {
        // bfs - 인접한 곳에 1이 있는 경우 탐색
        // 단지에 속하는 집 세어서 List 에 저장
        List<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        house = new int[n][n];
        
        for (int i=0;i<n;i++) {
            String input = sc.next();
            
            for (int j=0;j<n;j++) {
                house[i][j] = input.charAt(j) - '0'; // 문자를 숫자로 만들기
            }
        }
        
        for (int i=0;i<n;i++) {
            for (int j=0;j<n;j++) {
                if (house[i][j] == 1)
                    list.add(bfs(i, j));
            }
        }
        
        Collections.sort(list); // list 오름차순 저렬
        System.out.println(list.size());
        for (int i=0;i<list.size();i++)
            System.out.println(list.get(i));
    }
    
    public static int bfs(int x, int y) {
        int count = 0;
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{x, y});
        house[x][y] = 0;
        
        while (!queue.isEmpty()) {
            count++; // 현재 탐색중인 곳 +1
            int[] pos = queue.poll();
            int posX = pos[0];
            int posY = pos[1];
            
            for (int i=0;i<4;i++) {
                int newX = posX + dx[i];
                int newY = posY + dy[i];

                if (newX >= 0 && newX < n && newY >= 0 && newY < n
                   && house[newX][newY] == 1) {
                    house[newX][newY] = 0; // 이미 방문한 곳 표시
                    queue.offer(new int[]{newX, newY});
                }
            }
        }
        
        return count;
    }
}