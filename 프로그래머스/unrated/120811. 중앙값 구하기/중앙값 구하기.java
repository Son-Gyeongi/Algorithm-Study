import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        Arrays.sort(array);
        int div = array.length / 2;
        return array[div];
    }
}