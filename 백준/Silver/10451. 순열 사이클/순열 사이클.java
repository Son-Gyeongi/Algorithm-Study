import java.util.*;

public class Main {
    public static int[] arr;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // 테스트 개수
        
        for (int i=0;i<t;i++) {
            int count = 0; // 순열 사이클 개수
            int n = sc.nextInt(); // 순열의 크기
            arr = new int[n+1];
            
            for (int j=1;j<arr.length;j++)
                arr[j] = sc.nextInt();
            
            // 깊이 탐색 해야하기 때문에 DFS(깊이 우선 탐색)
            for (int j=1;j<arr.length;j++) {
                if (arr[j] != 0) {
                    dfs(j, j); // arr[1] 부터 탐색 시작
                    count++;
                }
            }
            
            System.out.println(count);
        }
    }
    
    public static void dfs(int startIdx, int index) {
        int nextIdx = arr[index];
        
        if (startIdx == nextIdx) return; // 시작 지점과 같아지는 순간
        
        dfs(startIdx, nextIdx);
        arr[nextIdx] = 0; // 이미 방문한 곳 표시
    }
}