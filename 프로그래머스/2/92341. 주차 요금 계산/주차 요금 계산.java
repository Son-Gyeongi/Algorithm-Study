import java.util.*;

class Solution {
    public int[] solution(int[] fees, String[] records) {
        // 차량 번호를 키로 오름차순하기, 누적 시간 계산
        Map<String, Integer> map = new TreeMap<>();
        
        // records 시각을 모두 분으로 바꾸기
        for (int i=0;i<records.length;i++) {
            String[] record = records[i].split(" ");
            String[] time = record[0].split(":");
            int minute = Integer.parseInt(time[0])*60 + Integer.parseInt(time[1]);
            String num = record[1];
            String log = record[2];
            
            records[i] = minute + " " + num + " " + log;
        }
        
        // 입차, 출차 같은 차량 번호 찾기
        for (int i=0;i<records.length;i++) {
            if (records[i].equals("0")) continue;
            
            String[] record1 = records[i].split(" ");
            int minute1 = Integer.parseInt(record1[0]);
            String num1 = record1[1];
            String log1 = record1[2];
            boolean b = false; // 끝까지 출차가 없을 경우 false
            if (log1.equals("OUT")) continue;
            
            for (int j=0;j<records.length;j++) {
                if (records[j].equals("0")) continue;
                
                String[] record2 = records[j].split(" ");
                int minute2 = Integer.parseInt(record2[0]);
                String num2 = record2[1];
                String log2 = record2[2];
                if (log2.equals("IN")) continue;
                
                if (num1.equals(num2) && log1.equals("IN") && log2.equals("OUT")) {
                    int diff1 = minute2 - minute1;
                    records[i] = "0";
                    records[j] = "0";
                    int value1 = map.getOrDefault(num1, 0);
                    map.put(num1, value1+diff1);
                    b = true;
                    break;
                }
            }
            
            // 만약 입차만 있고 출차가 없다면 23:59 => 1439분
            if (!b) {
                int diff2 = 1439 - minute1;
                int value2 = map.getOrDefault(num1, 0);
                map.put(num1, value2+diff2);
            }
        }
        
        // 누적 시간으로 요금 계산
        int[] answer = new int[map.size()];
        int stdTime = fees[0];
        int stdMoney = fees[1];
        int unitTime = fees[2];
        int unitMoney = fees[3];
        
        int index = 0;
        for (String s : map.keySet()) {
            int value = map.get(s);
            if (stdTime >= value) answer[index++] = stdMoney;
            else {
                answer[index++] = stdMoney+ (int) Math.ceil((value-stdTime)/(float)unitTime) *unitMoney;
            }
        }
        
        return answer;
    }
}