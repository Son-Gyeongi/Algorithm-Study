class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";
         char letterChar = letter.charAt(0);

        for (int i = 0; i < my_string.length(); i++) {
            char my_char = my_string.charAt(i);
            if (my_char != letterChar) {
                answer = answer + my_char;
            }
        }

        return answer;
    }
}