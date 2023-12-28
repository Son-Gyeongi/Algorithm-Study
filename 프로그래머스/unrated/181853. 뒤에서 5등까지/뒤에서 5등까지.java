import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
        int[] array = Arrays.stream(num_list).sorted().toArray();
        return Arrays.copyOfRange(array, 0, 5);
    }
}