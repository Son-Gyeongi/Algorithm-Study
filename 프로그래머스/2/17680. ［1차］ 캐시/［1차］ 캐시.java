import java.util.*;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 5; // cities의 첫 요소는 무조건 실행 속도가 5임
        
        if (cacheSize == 0) return cities.length*5;
        
        // 캐시 크기만큼 캐시에 담고 - 대소문자 구분없음
        // cities를 하나씩 꺼냈을 때 캐시에 있다면 실행 시간은 1, 없다면 실행 시간은 5
        
        List<String> cacheStore = new ArrayList<>();
        cacheStore.add(cities[0].toLowerCase());
        
        for (int i=1;i<cities.length;i++) {

            if (cacheStore.contains(cities[i].toLowerCase())) {
                // 캐시 저장소에 cities[i] 가 존재
                answer++; // 1 증가
                
                // 캐시 마지막 값이랑 cities[i]랑 같은 경우에는 캐시에 넣지 않기
                if (cacheStore.get(cacheStore.size()-1).equals(cities[i].toLowerCase())) continue;
                
                // 캐시 사이즈 이상 넘으면 cacheStore에서 cities[i] 요소 제거
                if (cacheSize <= cacheStore.size()) {
                    cacheStore.remove(cities[i].toLowerCase());
                }
                
            } else {
                // 캐시에 cities[i]가 존재하지 않음
                answer += 5; // 5 증가
                
                // 캐시 마지막 값이랑 cities[i]랑 같은 경우에는 캐시에 넣지 않기
                if (cacheStore.get(cacheStore.size()-1).equals(cities[i].toLowerCase())) continue;
                
                // 캐시 사이즈 이상 넘으면 cacheStore에서 첫번째 요소 제거
                if (cacheSize <= cacheStore.size()) {
                    cacheStore.remove(0);
                }
            }
            
            cacheStore.add(cities[i].toLowerCase()); // 마지막 요소에 추가
        }
        
        return answer;
    }
}