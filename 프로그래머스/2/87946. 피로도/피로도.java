import java.util.*;

class Solution {
    public int solution(int k, int[][] dungeons) {
        List<Integer> answer = new ArrayList<>();
        
        // dungeons[i][0] - dungeons[i][1] 순서로 배열을 정렬 (내림차순)
        Arrays.sort(dungeons, (a,b) -> (b[0]-b[1]) - (a[0]-a[1]));
        
        for (int i=0;i<dungeons.length;i++) {
            int current = k;
            int temp = 0;
            
            for (int j=i;j<dungeons.length;j++) {
                // 현재 피로도 보다 최소 필요 피로도가 크면 탐험 못 할 수도 있음
                if (current <dungeons[j][0]) continue;

                current -= dungeons[j][1];
                temp++;
            }
            
            answer.add(temp);
        }
        
        int[][] first = Arrays.copyOf(dungeons, dungeons.length);
        Arrays.sort(first, (a,b) -> b[0] - a[0]); // dungeons에서 첫번째 요소[i][0]로 내림차순
        
        for (int i=0;i<first.length;i++) {
            int current = k;
            int temp = 0;
            
            for (int j=i;j<first.length;j++) {
                // 현재 피로도 보다 최소 필요 피로도가 크면 탐험 못 할 수도 있음
                if (current <first[j][0]) continue;

                current -= first[j][1];
                temp++;
            }
            
            answer.add(temp);
        }
        
        int[][] second = Arrays.copyOf(dungeons, dungeons.length);
        Arrays.sort(second, (a,b) -> a[1] - b[1]); // dungeons에서 두번째 요소[i][1]로 오름차순
        
        for (int i=0;i<second.length;i++) {
            int current = k;
            int temp = 0;
            
            for (int j=i;j<second.length;j++) {
                // 현재 피로도 보다 최소 필요 피로도가 크면 탐험 못 할 수도 있음
                if (current <second[j][0]) continue;

                current -= second[j][1];
                temp++;
            }
            
            answer.add(temp);
        }
        
        return Collections.max(answer);
    }
}