class Solution {
    private int answer = 0;

    public int solution(int[] numbers, int target) {
        countTarget(numbers, 0, target, 0);

        return answer;
    }

    public void countTarget(int[] numbers, int depth, int target, int total) {
        if(target == total && numbers.length == depth) {
            answer++;
        }

        if(depth == numbers.length) return;

        // - 인지 + 인지에 따라 다르게
        countTarget(numbers, depth+1, target, total-numbers[depth]);
        countTarget(numbers, depth+1, target, total+numbers[depth]);
    }
}