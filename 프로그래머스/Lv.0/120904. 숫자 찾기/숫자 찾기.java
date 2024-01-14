class Solution {
    public int solution(int num, int k) {
        String str = num + "";
        String[] strArr = str.split("");

        for (int i = 0; i < str.length(); i++) {
            if (strArr[i].equals(k + "")) {
                return i + 1;
            }
        }

        return -1;
    }
}