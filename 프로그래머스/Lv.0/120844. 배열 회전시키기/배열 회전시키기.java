class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        boolean dir = direction.equals("right");

        if (dir) {
            for (int i = 0; i < numbers.length - 1; i++) {
                answer[i + 1] = numbers[i];
            }
            answer[0] = numbers[numbers.length - 1];
        } else {
            for (int i = 0; i < numbers.length - 1; i++) {
                answer[i] = numbers[i + 1];
            }
            answer[answer.length - 1] = numbers[0];
        }

        return answer;
    }
}