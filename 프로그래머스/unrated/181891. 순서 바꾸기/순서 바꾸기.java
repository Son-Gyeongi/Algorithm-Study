import java.util.Arrays;
import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] ints = Arrays.copyOfRange(num_list, n, num_list.length);
        int[] ints1 = Arrays.copyOfRange(num_list, 0, n);

        return IntStream.concat(Arrays.stream(ints), Arrays.stream(ints1)).toArray();
    }
}