class Solution {
    public int solution(int n) {
        int answer = 0;
        StringBuilder builder = new StringBuilder();
        
        while (n >= 3) {
            builder.append(n%3);
            if (n/3 < 3) break;
            n /= 3;
        }
        if (n==1) builder.append(n%3);
        if (n/3 != 0) builder.append(n/3);
        
        builder.reverse();
        for (int i=0;i<builder.length();i++) {
            int num = builder.charAt(i) - '0';
            answer += num*Math.pow(3, i);
        }
        
        return answer;
    }
}