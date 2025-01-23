import java.util.*;

class Solution {
    public static int n;
    public static int m;
    
    public int solution(int[][] maps) {
        int answer = -1;
        
        n = maps.length; // 행 길이
        m = maps[0].length; // 열 길이
        
        if (n == 1) {
            if (maps[0][m-2] != 0) answer = m;
        } else if (m == 1) {
            if (maps[n-2][0] != 0) answer = n;
        } else if (maps[n-2][m-1] == 0 && maps[n-1][m-2] == 0) {
            // 상대 팀 진영이 막혀있을 경우
            answer = -1;
        } else {            
            answer = directions(maps);
        }
        
        return answer;
    }
    
    public static int directions(int[][] maps) {
        // 이동할 4가지 방향 (상,하,좌,우)
        int[] dx = {-1,1,0,0};
        int[] dy = {0,0,-1,1};
        
        Queue<Point> queue = new LinkedList<>();
        queue.add(new Point(0, 0)); // 처음 캐릭터 위치
        
        while (!queue.isEmpty()) {
            Point currentPos = queue.poll();
            int posX = currentPos.x;
            int posY = currentPos.y;
            
            if (posX == n-1 && posY == m-1) break; // 상대팀 진영에 도착하면 탐색 종료
            
            // 현재 위치에서 4가지 방향으로 위치 확인
            for (int i=0;i<4;i++) {
                int checkX = posX + dx[i];
                int checkY = posY + dy[i];
                
                // 배열의 범위를 벗어나는 경우 큐에 저장 안함
                if (checkX < 0 || checkX >= n || checkY < 0 || checkY >= m) continue;
                // 벽인 경우 큐에 저장 안함
                if (maps[checkX][checkY] == 0) continue;
                // 처음 방문한 곳에만 큐에 저장
                if (maps[checkX][checkY] == 1) {
                    maps[checkX][checkY] = maps[posX][posY] + 1;
                    queue.add(new Point(checkX, checkY));
                }
            }
        }
        
        // 다른 요소로 인해 아예 상대팀 진영에 도달하지 못할 경우 -1
        return maps[n-1][m-1] == 1 ? -1 : maps[n-1][m-1];
    }
}

class Point {
    int x;
    int y;
    
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}