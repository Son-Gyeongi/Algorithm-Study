class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        
        // 4. 콜라가 될 수 있는 수보다 적으면 break;
        while(n >= a) {
            // 1. n을 a로 나눈다.
            int cokeReceived = n/a*b; // 빈 병 주고 받은 콜라 개수, b는 n/a 한 후에 a만큼 b 수량을 곱한다.
            answer += cokeReceived;

            // 2. n을 a로 나눈 나머지 구하기
            int emptyBottleLeft = n%a; // 빈 병 주고 남은 빈 병 개수, a 미만임

            // 3. 다음에 계산할 빈 병을 n에 넣기
            n = (n/a*b) + emptyBottleLeft;
        }
        
        return answer;
    }
}