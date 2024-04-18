import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};

        int[] filteredArr = Arrays.stream(arr)
                .filter(a -> a % divisor == 0)
                .toArray();

        if (filteredArr.length == 0) {
            answer = new int[1];
            answer[0] = -1;
            return answer;
        }

        return Arrays.stream(filteredArr).sorted().toArray();
    }
}