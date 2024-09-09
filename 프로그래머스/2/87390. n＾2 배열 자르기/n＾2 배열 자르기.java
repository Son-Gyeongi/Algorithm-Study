class Solution {
    public int[] solution(int n, long left, long right) {
        int length = (int) (right - left);
        long[] procedure = new long[length+1];
        int[] answer = new int[length+1];

        int answerIdx = 0;
        for (long i = left;i<=right;i++) {
            long mok = i / n; // 몫
            long nam = i % n; // 나머지

            if (mok < nam) {
                procedure[answerIdx] = nam + 1;
            } else {
                procedure[answerIdx] = mok + 1;
            }

            answerIdx++;
        }

        // 타입을 long 에서 int 로 변경
        for (int i=0;i<procedure.length;i++) {
            answer[i] = (int) procedure[i];
        }

        return answer;
    }
}