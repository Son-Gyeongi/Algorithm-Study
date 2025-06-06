import java.util.*;

class Solution {
    public static boolean[][] visited; // 방문 여부 검사
    public static int[] dx = {0,0,-1,1}; // 좌우상하
    public static int[] dy = {-1,1,0,0}; // 좌우상하
    
    public int solution(int[][] maps) {
        // 표가 2칸인 경우
        if (maps.length == 2 && maps[0].length == 1) {
            if (maps[maps.length-1][maps[0].length-1] == 1) return 2;
            else return 1;
        }
        
        // 상대팀 진영에 도달할 수 없는 경우
        if (maps[maps.length-1][maps[0].length-2] == 0 
            && maps[maps.length-2][maps[0].length-1] == 0) return -1;
        
        // 상대팀 진영에 최단거리로 도달하기
        int answer = -1;
        visited = new boolean[maps.length][maps[0].length];
        Queue<Integer[]> q = new LinkedList<>();
        q.offer(new Integer[]{0,0,0}); // x,y 좌표 및 카운트
        visited[0][0] = true;
        
        while (!q.isEmpty()) {
            Integer[] location = q.poll();
            int x = location[0];
            int y = location[1];
            int count = location[2];
            
            if (x == maps.length - 1 && y == maps[0].length -1) {
                answer = count + 1;
                break;
            }
            
            for (int i=0;i<4;i++) {
                int tx = x+dx[i];
                int ty = y+dy[i];
                
                if (0 <= tx && tx < maps.length && 0 <= ty && ty < maps[0].length
                   && maps[tx][ty] == 1 && visited[tx][ty] == false) {
                    visited[tx][ty] = true;
                    q.offer(new Integer[]{tx,ty,count+1});
                }
            }
        }
                
        return answer;
    }
}