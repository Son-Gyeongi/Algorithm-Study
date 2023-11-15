class Solution {
    public String solution(String myString) {
        // toLowerCase() : 대문자를 소문자로 바꿔준다.
        return myString.toLowerCase().replaceAll("a", "A");
    }
}