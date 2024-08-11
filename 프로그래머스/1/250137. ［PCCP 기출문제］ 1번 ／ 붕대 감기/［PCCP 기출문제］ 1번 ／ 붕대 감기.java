import java.util.*;

class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {        
        // t초 동안 붕대를 감으면 t*x만큼 체력을 회복
        // t초 연속으로 붕대를 감는데 성공한다면 (t*x) + y 만큼 체력을 추가로 회복
        // 최대 체력 > 현재 체력
        
        // 기술을 쓰는 도중 공격 받으면 기술이 취소됨
        // 공격 받을 때 체력 회복 안됨
        // 공격 당해서 기술이 취소되거나 기술이 끝나면 그 즉시 붕대 감기(체력 회복) 사용, 연속 성공 시간 0으로 초기화
        
        // 몬스터 공격 받으면 정해진만큼 현재 체력 줄어듦
        // 현재 체력이 0 이하되면 캐릭터가 죽고 더 이상 체력 회복 안됨
        
        // 붕대 감기 기술의 시전 시간, 1초당 회복량, 추가 회복량을 담은 1차원 정수 배열 bandage
        // 최대 체력을 의미하는 정수 health
        // 몬스터의 공격 시간과 피해량을 담은 2차원 정수 배열 attacks
        
        // 모든 공격이 끝난 직후 남은 체력을 return
        // 만약 몬스터의 공격을 받고 캐릭터의 체력이 0 이하가 되어 죽는다면 -1을 return
        
        int lastAttack = attacks[attacks.length-1][0]; // 공격 받은 최대 초
        int successStreak = 0; // 연속 성공 횟수
        int presentHealth = health; // 현재 체력
        
        // attacks 공격 Map에 넣기
        Map<Integer, Integer> map = new HashMap<>();
        for (int i=0;i<attacks.length;i++) {
            int attackTime = attacks[i][0];
            int damage = attacks[i][1];
            map.put(attackTime, damage);
        }
        
        for (int i=1;i<=lastAttack;i++) {
            
            // 2. 공격 받으면 현재 체력 떨어지고 연속 성공 0으로 초기화
            if (map.containsKey(i)) {
                presentHealth -= map.get(i);
                
                if (presentHealth <= 0) return -1;
                
                successStreak = 0;
                continue;
            }
            
            // 1. 기본적으로 초가 늘면 체력이 회복됨, 하지만 최대 체력보다는 현재 체력이 적어야 증가 가능
            if (presentHealth < health) {
                successStreak++; // 연속 성공 횟수 증가
                int extraHealth = 0; // 붕대 감기 성공 시 추가 체력
                
                if (successStreak == bandage[0]) { // 붕대감기 기술 최대 시간에 도달했을 경우
                    successStreak = 0;
                    extraHealth = bandage[2];
                }
                
                // 초마다 추가 체력
                int stamina = bandage[1] + extraHealth;
                
                if (presentHealth + stamina > health) {
                    presentHealth = health;
                    successStreak++;
                    continue;
                }
                
                presentHealth += stamina;
            }
        }
        
        return presentHealth == 0 ? -1 : presentHealth;
    }
}