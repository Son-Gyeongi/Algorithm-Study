class Solution {
    public String solution(String myString, String pat) {
        int strLastIdx = myString.lastIndexOf(pat) + pat.length();

        return myString.substring(0, strLastIdx);
    }
}