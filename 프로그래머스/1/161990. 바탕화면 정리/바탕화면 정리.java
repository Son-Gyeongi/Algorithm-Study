class Solution {
    public int[] solution(String[] wallpaper) {
        int[] answer = {-1,-1,-1,-1};
        
        // 가로줄에서 가장 먼저 나오는 파일
        for (int i=0;i<wallpaper.length;i++) {
            String[] paper = wallpaper[i].split("");
            
            for (int j=0;j<paper.length;j++) {
                if (paper[j].equals("#")) {
                    answer[0] = i;
                    break;
                }
            }
            
            if (answer[0] != -1) break;
        }
        
        // 가로줄에서 가장 나중에 나오는 파일
        for (int i=wallpaper.length-1;i>=0;i--) {
            String[] paper = wallpaper[i].split("");
            
            for (int j=0;j<paper.length;j++) {
                if (paper[j].equals("#")) {
                    answer[2] = i+1;
                    break;
                }
            }
            
            if (answer[2] != -1) break;
        }
        
        // 세로줄에서 가장 먼저 나오는 파일
        for (int i=0;i<wallpaper[0].length();i++) {
            for (int j=0;j<wallpaper.length;j++) {
                if (wallpaper[j].charAt(i) == '#') {
                    answer[1] = i;
                    break;
                }
            }
            
            if (answer[1] != -1) break;
        }
        
        // 세로줄에서 가장 나중에 나오는 파일
        for (int i=wallpaper[0].length()-1;i>=0;i--) {
            for (int j=0;j<wallpaper.length;j++) {
                if (wallpaper[j].charAt(i) == '#') {
                    answer[3] = i+1;
                    break;
                }
            }
            
            if (answer[3] != -1) break;
        }
        
        return answer;
    }
}