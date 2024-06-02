class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        
        // x, x+1, x+2, x+3 ... - +가 되는 상수값 구하기
        int constant = (num-1)*num/2;
        
        // 예시 num이 4개인 경우 total = 4x+6; x는 이어지는 첫번째 값
        int x = (total-constant)/num;
        
        for (int i=0;i<num;i++) {
            answer[i] = x;
            x++;
        }
        
        return answer;
    }
}