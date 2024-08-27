import java.util.*;

public class Solution {
    public int solution(int n) {
        int ans = 0;

        // 한 번에 K 칸을 앞으로 점프 OR (현재까지 온 거리) x 2 에 해당하는 위치로 순간이동
        // 앞으로 K 칸을 점프하면 K 만큼의 건전지 사용량이 든다. OR 순간이동을 하면 건전지 사용량이 줄지 않는다.
        // 그러므로 아이언 슈트를 착용하고 이동할 때는 순간 이동을 하는 것이 더 효율적
        // 단, 건전지 사용량을 줄이기 위해 점프로 이동하는 것은 최소
        // 사용해야 하는 건전지 사용량의 최솟값을 return
        
        
        while(n != 0) {
            if (n % 2 == 1) {
                n--;
                ans++;
            } else {
                n /= 2;
            }
        }

        return ans;
    }
}