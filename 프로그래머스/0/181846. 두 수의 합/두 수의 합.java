import java.math.BigInteger;

class Solution {
    public String solution(String a, String b) {
        String answer = "";
        
        BigInteger ai = new BigInteger(a);
        BigInteger bi = new BigInteger(b);
        System.out.println(ai.add(bi));
        
        return String.valueOf(ai.add(bi));
    }
}