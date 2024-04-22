import java.util.Objects;

class Solution {
    public int solution(int[] array) {
        int answer = 0;

        for (int i = 0; i < array.length; i++) {
            String[] splitStr = String.valueOf(array[i]).split("");

            for (int j = 0; j < splitStr.length; j++) {
                if (Objects.equals(splitStr[j], "7")) {
                    answer++;
                }
            }
        }

        return answer;
    }
}