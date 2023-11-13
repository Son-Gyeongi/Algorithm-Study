class Solution {
    public int solution(String my_string) {
        String tmp = my_string.replaceAll("[A-Z, a-z]", ""); // "1234"

        int answer = tmp.chars()
                .map(Character::getNumericValue)
                .sum();

        return answer;
    }
}