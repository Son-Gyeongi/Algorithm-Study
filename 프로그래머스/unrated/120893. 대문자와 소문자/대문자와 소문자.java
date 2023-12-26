class Solution {
    public String solution(String my_string) {
        StringBuilder answer = new StringBuilder();

        int[] array = my_string.chars().map(i -> 'a' <= i && i <= 'z' ? i - 32 : i + 32).toArray();

        for (Integer number : array) {
            char character = (char) number.intValue();
            answer.append(character);
        }

        return answer.toString();
    }
}