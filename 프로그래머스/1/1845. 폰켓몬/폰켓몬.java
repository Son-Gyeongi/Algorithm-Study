import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int[] give = new int[nums.length/2];
        
        // 1. nums.length/2 만큼 가져갈 수 있음
        // 그런데 겹치지 않는 선에서 내가 최대로 가져갈 수 있는 포켓몬 개수
        
        // nums 배열 겹치지 않게 저장하기
        Set<Integer> set = new TreeSet<>();
        for (int i=0;i<nums.length;i++) {
            set.add(nums[i]);
        }
        System.out.println(set);
        
        // 중복되지 않는 포켓몬 수와 가져가야 할 포켓몬 수가 같은 경우
        if (set.size() == give.length) answer = set.size();
        // 중복되지 않는 포켓몬 수가 가져가야 할 포켓몬 수보다 많은 경우
        else if (set.size() > give.length) answer = give.length;
        // 중복되지 않는 포켓몬 수가 가져가야 할 포켓몬 수보다 적은 경우
        else if (set.size() < give.length) answer = set.size();
        
        return answer;
    }
}