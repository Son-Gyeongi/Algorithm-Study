import java.util.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        
        Map<String, Integer> map = new HashMap<>();
        map.put("R", 0); // 1번 지표
        map.put("T", 0); // 1번 지표
        map.put("C", 0); // 2번 지표
        map.put("F", 0); // 2번 지표
        map.put("J", 0); // 3번 지표
        map.put("M", 0); // 3번 지표
        map.put("A", 0); // 4번 지표
        map.put("N", 0); // 4번 지표
        
        Map<Integer, Integer> score = new HashMap<>();
        score.put(1, 3); // 매우 비동의
        score.put(2, 2); // 비동의
        score.put(3, 1); // 약간 비동의
        score.put(4, 0); // 모르겠음
        score.put(5, 1); // 약간 동의
        score.put(6, 2); // 동의
        score.put(7, 3); // 매우 동의
        
        for (int i=0;i<survey.length;i++) {
            String first = survey[i].split("")[0];
            String second = survey[i].split("")[1];
            
            int value = 0;
            if (choices[i] > 4) {
                value = map.get(second) + score.get(choices[i]);
                map.put(second, value);
            } else if (choices[i] < 4) {
                value = map.get(first) + score.get(choices[i]);
                map.put(first, value);
            }
        }
        
        // map 에 저장된 대로 answer에 담기
        // RT 1번 지표
        if (map.get("R") > map.get("T")
           || map.get("R") == map.get("T")) answer += "R";
        else if (map.get("R") < map.get("T")) answer += "T";
        
        // CF 2번 지표
        if (map.get("C") > map.get("F")
           || map.get("C") == map.get("F")) answer += "C";
        else if (map.get("C") < map.get("F")) answer += "F";
        
        // JM 3번 지표
        if (map.get("J") > map.get("M")
           || map.get("J") == map.get("M")) answer += "J";
        else if (map.get("J") < map.get("M")) answer += "M";
        
        // AN 4번 지표
        if (map.get("A") > map.get("N")
           || map.get("A") == map.get("N")) answer += "A";
        else if (map.get("A") < map.get("N")) answer += "N";
        
        return answer;
    }
}