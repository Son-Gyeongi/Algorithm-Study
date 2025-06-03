class Solution {
    public static int answer = 0;
    
    public int solution(int[] numbers, int target) {
        targetNumber(0, numbers, target, 0);
        return answer;
    }
    
    public static void targetNumber(int num, int[] numbers, int target, int depth) {
        if (num == target && depth == numbers.length) answer++;
        if (depth == numbers.length) return;
        
        for (int i=depth;i<depth+1;i++) {
            targetNumber(num+numbers[i], numbers, target, depth+1);
            targetNumber(num-numbers[i], numbers, target, depth+1);
        }
    }
}