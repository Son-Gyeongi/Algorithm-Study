import java.util.HashSet;
import java.util.Set;

class Solution {
    public int solution(int[] sides) {
        Set<Integer> set = new HashSet<>();

        // sides 배열 중에서 가장 긴 변일 경우
        int max = Math.max(sides[0], sides[1]);
        int min = Math.min(sides[0], sides[1]);

        for (int i=1;i<=max;i++){
            if ((max - min) < i) {
                set.add(i);
            }
        }

        // N 미지수가 가장 긴 변일 경우
        int sum = sides[0] + sides[1];

        for (int i=1;i<sum;i++){
            if (max < i) {
                set.add(i);
            }
        }

        return set.size();
    }
}