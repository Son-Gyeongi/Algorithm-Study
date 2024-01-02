import java.util.Arrays;
import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int[2];

        int[] sortedArr = Arrays.stream(array).sorted().toArray();

        answer[0] = sortedArr[sortedArr.length - 1];
        answer[1] = IntStream.rangeClosed(0, array.length)
                .filter(i -> answer[0] == array[i])
                .findFirst().getAsInt();

        return answer;
    }
}