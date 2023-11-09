class Solution {
    public int solution(int n) {
        // 제곱근
        return (Math.sqrt(n) % 1 == 0) ? 1 : 2;
    }
}