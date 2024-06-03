class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        
        // 분자
        int numerator = (numer1*denom2)+(denom1*numer2);
        // 분모
        int denominator = denom1*denom2;
        
        // 분자/분모 약분하고 배열에 담기
        // - 최대 공약수 구하기
        int divider = gcd(numerator, denominator);
        
        answer[0] = numerator/divider;
        answer[1] = denominator/divider;
        
        return answer;
    }
    
    // 최대 공약수 구하기
    public static int gcd(int a, int b) {
        if (b==0) return a;
        
        return gcd(b,a%b);
    }
}