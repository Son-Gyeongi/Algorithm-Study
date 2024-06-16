class Solution {
    public String[] solution(String my_str, int n) {
        int answerLength = (my_str.length()/n) + (my_str.length() % n == 0 ? 0 : 1);
        String[] answer = new String[answerLength];
        
        int x = 0;
        int y = n;
        for (int i=0;i<answer.length;i++) {
            if (y <= answer.length*n - n)
                answer[i] = my_str.substring(x, y);
            else // 마지막에 my_str이 n 만큼 딱 떨어지지 않을 경우
                answer[i] = my_str.substring(x);
            x += n;
            y += n;
        }
        
        return answer;
    }
}