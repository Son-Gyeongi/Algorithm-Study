import java.util.*;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        
        if (a == b && b == c && c == d) {
            answer = 1111 * a;
        } else if (a != b && b != c && c == d && d == a) {
            answer = (int) Math.pow((10*a+b), 2);
        } else if (a == b && b != c && c != d && d == a) {
            answer = (int) Math.pow((10*b+c), 2);
        } else if (a == b && b == c && c != d && d != a) {
            answer = (int) Math.pow((10*c+d), 2);
        } else if (a != b && b == c && c == d && d != a) {
            answer = (int) Math.pow((10*d+a), 2);
        } else if (a == b && c == d) {
            answer = (a+c) * Math.abs(a - c);
        } else if (a == c && b == d) {
            answer = (a+b) * Math.abs(a - b);
        } else if (a == d && b == c) {
            answer = (a+b) * Math.abs(a - b);
        } else if (a == b && c == d) {
            answer = (a+c) * Math.abs(a - c);
        } else if (a == b) {
            answer = c*d;
        } else if (b == c) {
            answer = a*d;
        } else if (c == d) {
            answer = a*b;
        } else if (d == a) {
            answer = b*c;
        } else if (a == c) {
            answer = b*d;
        } else if (b == d) {
            answer = a*c;
        } else {
            // 모두 다른 숫자일 경우
            int min = a;
            
            min = Math.min(min, b);
            min = Math.min(min, c);
            min = Math.min(min, d);
            
            answer = min;
        }
        
        return answer;
    }
}