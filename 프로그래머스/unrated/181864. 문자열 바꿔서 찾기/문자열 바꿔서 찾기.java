class Solution {
    public int solution(String myString, String pat) {
        String strArr = "";

        for (int i = 0; i < myString.length(); i++) {
            if (myString.charAt(i) == 'A') strArr += 'B';
            if (myString.charAt(i) == 'B') strArr += 'A';
        }
        System.out.println(strArr);
        return strArr.contains(pat) ? 1 : 0;
    }
}