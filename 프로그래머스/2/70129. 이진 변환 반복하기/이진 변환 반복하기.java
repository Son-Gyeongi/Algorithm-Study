class Solution {
    public int[] solution(String s) {
        /*
        1. s길이 계산
        2. s에서 0을 제거 -> s길이 계산(0제거 후 길이)
        3. 제거한 0의 개수 세기(zeroCount)
        4. s의 길이를 2진수로 만들기
        5. s가 1이 될때까지 반복(count)
        */
        int count = 0, zeroCount = 0;
        int sLength = 0;
        
        while (!s.equals("1")) {
            count++;
            sLength = s.length();
            s = s.replace("0", "");
            int tmpLength = s.length();
            zeroCount += sLength - tmpLength;
            s = Integer.toString(tmpLength, 2);
        }
        
        int[] answer = {count, zeroCount};
        return answer;
    }
}