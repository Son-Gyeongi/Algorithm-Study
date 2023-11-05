class Solution {
    public int solution(int n) {
        int answer = 0;
        int pizza = 6; // 피자 조각

        while (true) {
            answer = pizza / n >= 0 ? ++answer : answer;
            if (pizza % n == 0) break;
            pizza += 6;
        }

        return answer;
    }
}