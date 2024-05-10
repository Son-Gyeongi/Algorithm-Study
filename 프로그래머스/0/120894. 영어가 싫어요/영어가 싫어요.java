import java.util.*;

class Solution {
    public long solution(String numbers) {
        String[] numberArr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        for (String s : numberArr) {
            int index = Arrays.asList(numberArr).indexOf(s);
            numbers = numbers.replace(s, String.valueOf(index));
        }

        return Long.parseLong(numbers);
    }
}