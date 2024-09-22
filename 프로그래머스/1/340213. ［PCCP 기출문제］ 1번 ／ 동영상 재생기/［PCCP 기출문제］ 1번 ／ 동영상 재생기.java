class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        String answer = "";
        
        // 분을 초로 변환 후 나머지 초랑 더하기
        int videoSeconds = (Integer.parseInt(video_len.split(":")[0]) * 60) + Integer.parseInt(video_len.split(":")[1]);
        int posSeconds = (Integer.parseInt(pos.split(":")[0]) * 60) + Integer.parseInt(pos.split(":")[1]);
        int op_startSeconds = (Integer.parseInt(op_start.split(":")[0]) * 60) + Integer.parseInt(op_start.split(":")[1]);
        int op_endSeconds = (Integer.parseInt(op_end.split(":")[0]) * 60) + Integer.parseInt(op_end.split(":")[1]);
        
        // 처음에 오프닝 구간인지 확인
        if (op_startSeconds <= posSeconds && posSeconds <= op_endSeconds) posSeconds = op_endSeconds;
        
        // commands 반복문
        for (int i=0;i<commands.length;i++) {
            String command = commands[i];
            
            if (command.equals("next")) {
                posSeconds += 10;
                
                if (posSeconds > videoSeconds) posSeconds = videoSeconds;
            } else {
                posSeconds -= 10;
                
                if (posSeconds < 0) posSeconds = 0;
            }
            
            // 오프닝 구간인지 확인
            if (op_startSeconds <= posSeconds && posSeconds <= op_endSeconds) posSeconds = op_endSeconds;
        }
        
        // posSeconds 다시 String 타입으로 변경
        String minute = posSeconds/60 >= 10 ? String.valueOf(posSeconds/60) : "0"+posSeconds/60;
        String second = posSeconds%60 >= 10 ? String.valueOf(posSeconds%60) : "0"+posSeconds%60;
        
        return minute + ":" + second;
    }
}