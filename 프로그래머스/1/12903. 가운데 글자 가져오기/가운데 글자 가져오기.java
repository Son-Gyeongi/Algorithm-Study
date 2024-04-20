class Solution {
    public String solution(String s) {
        int start = s.length() % 2 == 0 ? (s.length() / 2) - 1 : s.length() / 2; // 길이 = 짝수 : 홀수
        int end = (s.length() / 2) + 1;

        return s.substring(start, end);
    }
}