class Solution {
    public int solution(int a, int b) {
        boolean _a = (a % 2 == 1); // 홀수 true, 짝수 false
        boolean _b = (b % 2 == 1);

        if (_a && _b) return a*a + b*b;
        else if (_a || _b) return 2 * (a + b);
        else return Math.abs(a - b);
    }
}