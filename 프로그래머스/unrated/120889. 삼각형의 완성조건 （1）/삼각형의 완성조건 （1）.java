import java.util.Arrays;

class Solution {
    public int solution(int[] sides) {
        // 배열 정렬
        int[] sidesSort = Arrays.stream(sides).sorted().toArray();

        return sidesSort[2] < sidesSort[1] + sidesSort[0] ? 1 : 2;
    }
}