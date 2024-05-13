import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        int j = 0;

        for (int[] query : queries) {
            int[] temp = Arrays.copyOfRange(arr, query[0], query[1] + 1);

            int min = 1_000_001;

            for (int i = 0; i < temp.length; i++) {
                if (query[2] < temp[i]) {
                    min = Math.min(min, temp[i]);
                }
            }
            answer[j] = min == 1_000_001 ? -1 : min;
            j++;
        }

        return answer;
    }
}