class Solution {
    public int solution(int a, int b) {

        String ab = "" + a + b;
        Integer intab = Integer.valueOf(ab);
        int multiab = 2 * a * b;

        return intab >= multiab ? intab : multiab;
    }
}