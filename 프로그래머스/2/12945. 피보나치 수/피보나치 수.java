import java.util.*;

class Solution {
    public static final int[] mem = new int[100001];
    public static int fibonacci(int n) {
        if (mem[n]!=-1) return mem[n]%1234567;
        if (n==0||n==1) return n%1234567;
        return mem[n] = fibonacci(n-1)%1234567+fibonacci(n-2)%1234567;
    }
    
    public int solution(int n) {
        Arrays.fill(mem, -1);
        int answer = fibonacci(n)%1234567;
        return answer;
    }
}