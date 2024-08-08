import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = new String[players.length];
        
        // 등수 -> 플레이어 이름
        Map<Integer, String> ranks = new HashMap<>();
        // 플레이어 이름 -> 등수
        Map<String, Integer> playerToRank = new HashMap<>();
        
        for (int i=0;i<players.length;i++) {
            ranks.put(i+1, players[i]);
            playerToRank.put(players[i], i+1);
        }
        
        for (int i=0;i<callings.length;i++) {
            // TODO ranks에서 callings의 값과 같은 값을 찾는 빠른 방법을 찾아보세요.
            int overtaking = playerToRank.get(callings[i]); // 추월하는 사람 등수
            String overtaken = ranks.get(overtaking-1); // 추월 당하는 사람 이름
            
            // 추월 당하는 사람
            ranks.put(overtaking, overtaken);
            playerToRank.put(overtaken, overtaking);
            
            // 추월 하는 사람
            ranks.put(overtaking-1, callings[i]);
            playerToRank.put(callings[i], overtaking-1);
        }
        
        // ranks 저장된 등수대로 answer 배열에 넣기
        for (int i=0;i<answer.length;i++) {
            answer[i] = ranks.get(i+1);
        }
        
        return answer;
    }
}