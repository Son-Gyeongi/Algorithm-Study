import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int computer = sc.nextInt();
        int network = sc.nextInt();
        Map<Integer, List<Integer>> connect = new HashMap<>();
        
        // 컴퓨터와 직접 연결된 컴퓨터 Map 에 저장
        for (int i=0;i<network;i++) {
            int value1 = sc.nextInt();
            int value2 = sc.nextInt();
            
            if (connect.containsKey(value1)) {
                List<Integer> list = connect.get(value1);
                list.add(value2);
                connect.put(value1, list);
            } else {
                List<Integer> list = new ArrayList<>();
                list.add(value2);
                connect.put(value1, list);
            }
            
            if (connect.containsKey(value2)) {
                List<Integer> list = connect.get(value2);
                list.add(value1);
                connect.put(value2, list);
            } else {
                List<Integer> list = new ArrayList<>();
                list.add(value1);
                connect.put(value2, list);
            }
        }
        
        // 큐를 사용해서 감염된 컴퓨터 세기
        boolean[] visited = new boolean[computer+1];
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);
        int count = 0; // 감염된 컴퓨터 세기
        visited[1] = true;
        
        while (!queue.isEmpty()) {
            int com = queue.poll();
            
            if (connect.containsKey(com)) {
                List<Integer> connectedCom = connect.get(com);
                
                for (int i=0;i<connectedCom.size();i++) {
                    int conCom = connectedCom.get(i); // com 에 연결된 conCom
                    if (!visited[conCom]) {
                        count++;
                        queue.offer(conCom);
                        visited[conCom] = true; // 이미 방문한 곳은 제외
                    }
                }
            }
        }
        
        System.out.println(count);
    }
}