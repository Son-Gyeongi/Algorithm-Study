class Solution {
    public int solution(String myString, String pat) {
        String myString_upperCase = myString.toUpperCase();
        String pat_upperCase = pat.toUpperCase();

        return myString_upperCase.contains(pat_upperCase) ? 1 : 0;
    }
}