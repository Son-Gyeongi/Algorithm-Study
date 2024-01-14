import java.util.Arrays;

class Solution {
    public int solution(String number) {
        String[] split = number.split("");
        int sum = Arrays.stream(split).mapToInt(Integer::parseInt).sum();

        return sum % 9;
    }
}