class Solution {
    public boolean check(String str1, String str2) {
        int length = Math.min(str1.length(), str2.length());
        
        for (int i=0;i<length;i++) {
            if (str1.charAt(i) != str2.charAt(i)) return false;
        }
        
        return true;
    }
    
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        
        for (int i=0;i<skill_trees.length;i++) {
            if (check(skill, skill_trees[i].replaceAll("[^"+skill+"]", ""))) answer++;
        }
        
        return answer;
    }
}