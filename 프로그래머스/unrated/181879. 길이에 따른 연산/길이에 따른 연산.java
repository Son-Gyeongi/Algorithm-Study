class Solution {
    public int solution(int[] num_list) {
        int answer = 0;

        // 배열 길이 11이상이면 더하기, 배열 길이 10이하이면 곱하기
        if (num_list.length >= 11) {
            for (int num : num_list) {
                answer += num;
            }
        } else {
            answer =1;
            for (int num : num_list) {
                answer *= num;
            }
        }

        return answer;
    }
}