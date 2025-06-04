import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int[] students = new int[n];
        Arrays.fill(students, 1); // 각 학생이 처음에 가지고 있던 체육복 1개
        
        // 여벌이 있는 학생
        for (int i=0;i<reserve.length;i++) {
            students[reserve[i]-1] += 1;
        }
        
        // 잃어버린 학생
        for (int i=0;i<lost.length;i++) {
            students[lost[i]-1] -= 1;
        }
        
        for (int i=0;i<students.length-1;i++) {
            if (students[i] == 2 && students[i+1] == 0) {
                students[i] -= 1;
                students[i+1] += 1;
            } else if (students[i] == 0 && students[i+1] == 2) {
                students[i] += 1;
                students[i+1] -= 1;
            }
        }
        
        int answer = (int) Arrays.stream(students).filter(c -> c != 0).count();
        return answer;
    }
}