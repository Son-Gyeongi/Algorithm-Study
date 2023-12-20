class Solution {
    public int solution(int n, String control) {
        int answer = n;

        /*
        "w" : n이 1 커집니다.
        "s" : n이 1 작아집니다.
        "d" : n이 10 커집니다.
        "a" : n이 10 작아집니다.
         */
        for (int i = 0; i < control.length(); i++) {
            if (control.charAt(i) == 'w') answer += 1;
            else if (control.charAt(i) == 's') answer -= 1;
            else if (control.charAt(i) == 'd') answer += 10;
            else answer -= 10;
        }

        return answer;
    }
}