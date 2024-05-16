import java.math.BigInteger;

class Solution {
    public BigInteger solution(int balls, int share) {
        BigInteger answer;

        answer = factorial(balls).divide(factorial(balls - share).multiply(factorial(share)));

        return answer;
    }

    public static BigInteger factorial(int num) {
        BigInteger sum = new BigInteger("1");

        for (int i=num;i>=1;i--) {
            sum = sum.multiply(new BigInteger(String.valueOf(i)));
        }

        return sum;
    }
}