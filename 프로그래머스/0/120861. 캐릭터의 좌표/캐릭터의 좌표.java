class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2];
        int width = board[0]/2;
        int height = board[1]/2;

        for (String s : keyinput) {

            if (s.equals("left") && -width < answer[0]) {
                answer[0] -= 1;
            }
            if (s.equals("right") && answer[0] < width) {
                answer[0] += 1;
            }
            if (s.equals("down") && -height < answer[1]) {
                answer[1] -= 1;
            }
            if (s.equals("up") && answer[1] < height) {
                answer[1] += 1;
            }
        }

        return answer;
    }
}