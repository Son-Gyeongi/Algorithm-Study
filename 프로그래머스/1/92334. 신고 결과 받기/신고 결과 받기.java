import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        
        // 각 id 별로 신고당한 횟수가 k이상인 경우 저장
        Map<String, Set<String>> mapList = new HashMap<>(); // 신고한 사람 저장
        Map<String, Integer> map = new HashMap<>(); // 신고 당한 사람, 횟수 저장
        for (int i=0;i<report.length;i++) {
            String reportedA = report[i].split(" ")[0]; // 신고한 id가 또 신고 못함
            String reportedB = report[i].split(" ")[1]; // 신고 당한 id
            
            // 신고한 사람이 없는 경우 mapList에 초기화
            mapList.putIfAbsent(reportedA, new HashSet<>());
            
            // 이미 신고한 경우 중복 신고 장지
            if (!mapList.get(reportedA).contains(reportedB)) {
                // 신고한 id 저장
                mapList.get(reportedA).add(reportedB);
                
                // 신고 당한 횟수 카운트
                map.put(reportedB, map.getOrDefault(reportedB, 0) + 1);
            }
        }
        
        // k 이상 신고당한 id의 경우 신고한 id에게 이메일 통보
        Map<String, Integer> email = new HashMap<>();
        for (String keyB : map.keySet()) { // keyB 신고 당한 사람
            if (map.get(keyB) >= k) {
                for (String keyA : mapList.keySet()) { // keyA 신고한 사람
                    if (mapList.get(keyA).contains(keyB)) {
                        email.put(keyA, email.getOrDefault(keyA, 0) + 1);
                    }
                }
            }
        }
        
        // email Map컬렉션에 있는 값들을 answer 배열에 옮기기
        for (int i=0;i<id_list.length;i++) {
            answer[i] = email.getOrDefault(id_list[i], 0);
        }
        
        return answer;
    }
}