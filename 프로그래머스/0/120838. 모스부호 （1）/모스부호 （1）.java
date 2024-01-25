import java.util.HashMap;

class Solution {
    public String solution(String letter) {
        String answer = "";
        
        String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.",
                            "--.", "....", "..", ".---", "-.-", ".-..",
                            "--", "-.", "---", ".--.", "--.-", ".-.",
                            "...", "-", "..-", "...-", ".--", "-..-",
                            "-.--", "--.."};

        HashMap<String, Character> morseStr = new HashMap<>();

        for (int i = 0; i < morse.length; i++) {
            morseStr.put(morse[i], (char) (97 + i));
        }

        String[] splitLetter = letter.split(" ");

        for (String s : splitLetter) {
            answer += morseStr.get(s);
        }

        return answer;
    }
}