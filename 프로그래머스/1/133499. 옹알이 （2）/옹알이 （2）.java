class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] pronunciation = {"aya", "ye", "woo", "ma"};
        
        for (int i=0;i<babbling.length;i++) {
            for (int j=0;j<pronunciation.length;j++) {
                if (babbling[i].contains(pronunciation[j]+pronunciation[j])) {
                    babbling[i] = babbling[i].replaceFirst(pronunciation[j], "1");
                } else {
                    babbling[i] = babbling[i].replace(pronunciation[j], "1");
                }
            }
        }
        
        for (int i=0;i<babbling.length;i++) {
            babbling[i] = babbling[i].replace("1", "");
            if (babbling[i].equals("")) answer++;
        }
        
        return answer;
    }
}