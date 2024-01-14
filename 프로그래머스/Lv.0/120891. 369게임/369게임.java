import java.util.Arrays;

class Solution {
    public int solution(int order) {
        String[] split = String.valueOf(order).split("");

        return (int) Arrays.stream(split).mapToInt(Integer::parseInt)
                .filter(i -> i % 3 == 0 && i != 0)
                .count();
    }
}