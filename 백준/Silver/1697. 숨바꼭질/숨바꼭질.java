import java.util.*;

public class Main {
    public static int second, k;
    public static int[] check = new int[100001];
    
    public static void main(String[] args) {
        // 걷는 경우 x-1,x+1 / 순간 이동 2*x 를 번갈아 가면서 계산하기
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 언니 위치
        k = sc.nextInt(); // 동생 위치
        
        bfs(n);
        
        System.out.println(second);
    }
    
    public static void bfs(int n) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{n,0});
        check[n] = 1;
        
        while(!queue.isEmpty()) {
            int[] pos = queue.poll();
            int num = pos[0];
            int count = pos[1];
            
            if (num == k) {
                second = count;
                break;
            }
            
            if (0 <= num-1 && num-1<=100000 && check[num-1] == 0) {
                check[num-1] = 1;
                queue.offer(new int[]{num-1, count+1});
            }
            
            if (0 <= num+1 && num+1<=100000 && check[num+1] == 0) {
                check[num+1] = 1;
                queue.offer(new int[]{num+1, count+1});
            }
            
            if (0 <= 2*num && 2*num<=100000 && check[2*num] == 0) {
                check[2*num] = 1;
                queue.offer(new int[]{2*num, count+1});
            }
        }
    }
}