class Solution {
    public long solution(long n) {
        long answer = 0;
        String[] splitStr = String.valueOf(n).split("");

        for (int i = 0; i < splitStr.length; i++) {
            for (int j = i + 1; j < splitStr.length; j++) {
                if (Long.parseLong(splitStr[i]) < Long.parseLong(splitStr[j])) {
                    String temp = splitStr[i];
                    splitStr[i] = splitStr[j];
                    splitStr[j] = temp;
                }
            }
        }

        String collectStr = String.join("", splitStr);

        return Long.parseLong(collectStr);
    }
}