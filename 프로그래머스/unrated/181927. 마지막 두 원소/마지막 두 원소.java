import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
        int numLastBefore = num_list[num_list.length - 2];
        int numLast = num_list[num_list.length - 1];

        int[] answer = Arrays.copyOfRange(num_list, 0, num_list.length+1);
        System.out.println(Arrays.toString(answer));
        answer[answer.length - 1] = numLast > numLastBefore ? numLast - numLastBefore : numLast * 2;

        return answer;
    }
}