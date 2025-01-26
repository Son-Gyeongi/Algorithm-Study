import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int answer = 0;
        int N = sc.nextInt(); // 행
        int M = sc.nextInt(); // 열
        int[][] maze = new int[N][M];
        
        for (int i=0;i<N;i++) {
            String[] input = sc.next().split("");
            
            for (int j=0;j<M;j++) {
                maze[i][j] = Integer.parseInt(input[j]);
            }
        }
        
        // 상하좌우 칸 탐색
        int[] dx = {-1,1,0,0};
        int[] dy = {0,0,-1,1};
        
        Queue<Point> queue = new LinkedList<>();
        queue.offer(new Point(0,0,1));
        
        while(!queue.isEmpty()) {
            Point point = queue.poll();
            int posX = point.x;
            int posY = point.y;
            int distance = point.distance;
            
            if (posX == N-1 && posY == M-1) {
                answer = distance;
                break;
            }
            
            for (int i=0;i<4;i++) {
                int newX = posX + dx[i];
                int newY = posY + dy[i];
                
                if (newX >= 0 && newX < N && newY >= 0 && newY < M
                   && maze[newX][newY] == 1) {
                    // 행,열 범위를 벗어나지 않고 길이 막혀있지 않으면 queue에 넣기
                    queue.offer(new Point(newX, newY, distance+1));
                    maze[newX][newY] = 0; // 지나온 길 탐색 하지 않음
                }
            }
        }
        
        System.out.println(answer);
    }
}

class Point {
    int x;
    int y;
    int distance;
    
    Point(int x, int y, int distance) {
        this.x = x;
        this.y = y;
        this.distance = distance;
    }
}