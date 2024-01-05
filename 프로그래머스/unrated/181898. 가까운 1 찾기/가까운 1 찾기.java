import java.util.stream.IntStream;

class Solution {
    public int solution(int[] arr, int idx) {
        return IntStream.range(0, arr.length)
                .filter(i -> idx <= i)
                .filter(i -> arr[i] == 1)
                .findFirst()
                .orElse(-1);
    }
}