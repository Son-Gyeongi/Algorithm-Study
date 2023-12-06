class Solution {
    public int solution(int a, int b) {
        String aStr = "" + a;
        String bStr = "" + b;

        String str = Integer.parseInt(aStr + bStr) >= Integer.parseInt(bStr + aStr) ? aStr + bStr : bStr + aStr;

        return Integer.parseInt(str);
    }
}