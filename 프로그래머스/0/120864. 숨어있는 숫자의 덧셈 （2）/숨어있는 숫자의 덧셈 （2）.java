import java.util.Arrays;

class Solution {
    public int solution(String my_string) {
        String s = my_string.replaceAll("[a-zA-Z]", " ");

        return Arrays.stream(s.split(" "))
                .filter(i -> !i.isEmpty())
                .mapToInt(Integer::valueOf)
                .sum();
    }
}