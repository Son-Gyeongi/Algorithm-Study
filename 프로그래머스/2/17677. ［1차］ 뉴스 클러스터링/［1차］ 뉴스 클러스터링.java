import java.util.*;

class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
        
        // 1. str1 과 str2 가 똑같을 경우
        String str1LowerCase = str1.toLowerCase();
        if (str1LowerCase.equals(str2)) return 65536;
        
        // 2. str1 과 str2 가 다를 경우
        String[] str1Arr = str1.split("");
        String[] str2Arr = str2.split("");
        
        // 2개 문자열 합친 값 Map
        Map<String, Integer> str1Count = new HashMap<>();
        Map<String, Integer> str2Count = new HashMap<>();
        
        // 일단 문자열을 2개씩 쪼개서 저장
        // 저장하기 전에 특수문자가 있는 경우 확인하고 저장 안함
        // 저장하기 전에 문자열을 소문자로 바꾸기
        for (int i=0;i<str1Arr.length-1;i++) { // 공백, 특수문자인 경우 true
            if (str1Arr[i].matches(".*[\\s[^a-zA-Z]].*") 
                || str1Arr[i+1].matches(".*[\\s[^a-zA-Z]].*")) continue;
            
            String str = str1Arr[i] + str1Arr[i+1];
            str = str.toLowerCase();
            str1Count.put(str, str1Count.getOrDefault(str, 0) +1);
        }
        
        for (int i=0;i<str2Arr.length-1;i++) {
            if (str2Arr[i].matches(".*[\\s[^a-zA-Z]].*") 
                || str2Arr[i+1].matches(".*[\\s[^a-zA-Z]].*")) continue;
            
            String str = str2Arr[i] + str2Arr[i+1];
            str = str.toLowerCase();
            str2Count.put(str, str2Count.getOrDefault(str, 0) +1);
        }
        
        if (str1Count.size() == 0 || str2Count.size() == 0) return 0;
        
        int intersectionCount = 0; // 교집합 개수 세기 - Map 에서 2 이상인 키 개수 세기
        int unionCount = 0; // 합집합 개수 세기
        for (String key1 : str1Count.keySet()) {
            for (String key2 : str2Count.keySet())
                if (key1.equals(key2)) {
                    int value1 = str1Count.get(key1);
                    int value2 = str2Count.get(key2);
                    
                    if (value1 == 1 && value2 == 1) {
                        intersectionCount++;
                        unionCount++;
                    } else {
                        int min = Math.min(value1, value2);
                        int max = Math.max(value1, value2);
                        
                        intersectionCount += min;
                        unionCount += max;
                    }
                    
                    str1Count.put(key1, 0);
                    str2Count.put(key2, 0);
                    break;
                }
        }
        
        int addCount = 0;
        for (String key : str1Count.keySet()) {
            if (str1Count.get(key) == 0) continue;
            addCount += str1Count.get(key);
        }
        
        for (String key : str2Count.keySet()) {
            if (str2Count.get(key) == 0) continue;
            addCount += str2Count.get(key);
        }
        
        // 자카드 유사도
        double jaccardSimilarity = (intersectionCount / (double) (unionCount+addCount)) * 65536;
        answer = (int) jaccardSimilarity;
        
        return answer;
    }
}