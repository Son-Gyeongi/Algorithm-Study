class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] pronunciation = {"aya", "ye", "woo", "ma"};
        String[] temp = new String[babbling.length];
        
        for (int i=0; i < babbling.length;i++) {
            for (int j=0;j<pronunciation.length;j++) {
                String p = pronunciation[j];
                babbling[i] = babbling[i].replace(p, "1");
            }
        }
        
        
        for (int i=0;i<babbling.length;i++) {
            String bab = babbling[i].replace("1", "");
            if (bab.equals("")) answer++;
        }
        
        return answer;
    }
}