import java.util.*;

class Solution {
    // numbers의 가능한 모든 숫자 조합을 중복이 허용되지 않는 Set 에 저장하기
    public static Set<Integer> set = new TreeSet<>(); // 중복 안됨, 오름차순
    public static String[] arr;
    public static boolean[] bArr;
    
    // numbers에 있는 모든 값 조합하기
    public void combination(String str) {
        if (!str.isEmpty()) { // !str.equals("")
            set.add(Integer.valueOf(str));
        }
        
        if (str.length() == arr.length) return;
        
        for (int i=0;i<arr.length;i++) {
            if (!bArr[i]) {
                bArr[i] = true;
                combination(str + arr[i]);
                bArr[i] = false;
            }
        }
    }
    
    public int solution(String numbers) {
        int answer = 0;
        arr = numbers.split("");
        bArr = new boolean[arr.length];        
        combination("");
        
        for (Integer i : set) {
            if (i == 0 || i == 1) continue;
            
            // 소수 검사
            int count = 2;
            for (int j=2;j<=i/2;j++) {
                if (i%j==0) count++;
            }
            
            if (count == 2) answer++;
        }
        System.out.println(set);
        System.out.println(answer);
        
        return answer;
    }
}