class Solution {
    public int[] solution(int n, int m) {
        int max = 0; // 최대공약수 저장
        int min; // 최소공배수 저장

        int len = Math.min(n, m);

        for (int i = len; i >= 1; i--) {
            if (n % i == 0 && m % i == 0) {
                max = i;
                break;
            }
        }

        min = n * m / max;

        return new int[]{max, min};
    }
}