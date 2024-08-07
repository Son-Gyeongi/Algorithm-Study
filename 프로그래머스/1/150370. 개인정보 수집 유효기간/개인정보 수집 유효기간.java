import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        List<Integer> answer = new ArrayList<>();
        
        // 1.
        String[] todayArr = today.split("\\.");
        int todayYear = Integer.parseInt(today.split("\\.")[0]);
        int todayMonth = Integer.parseInt(today.split("\\.")[1]);
        int todayDay = Integer.parseInt(today.split("\\.")[2]);
        
        // 2.
        Map<String, Integer> map = new HashMap<>();
        for (int i=0;i<terms.length;i++) {
            String term = terms[i].split(" ")[0];
            Integer months = Integer.parseInt(terms[i].split(" ")[1]);
            
            map.put(term, months);
        }
        
        // 3.
        for (int i=0;i<privacies.length;i++) {
            String date = privacies[i].split(" ")[0];
            String dateYear = date.split("\\.")[0];
            String dateMonth = date.split("\\.")[1];
            String dateDay = date.split("\\.")[2];
            
            String term = privacies[i].split(" ")[1];
            
            int tempYear = Integer.parseInt(dateYear);
            int tempMonth = Integer.parseInt(dateMonth) + map.get(term);
            if (tempMonth > 12) {
                tempMonth = (Integer.parseInt(dateMonth) + map.get(term)) % 12 == 0 ? 12
                    : (Integer.parseInt(dateMonth) + map.get(term)) % 12;
                tempYear += ((Integer.parseInt(dateMonth) + map.get(term)) % 12 == 0 ?
                             (Integer.parseInt(dateMonth) + map.get(term)) / 12 - 1
                             : (Integer.parseInt(dateMonth) + map.get(term)) / 12);
            }
            int tempDay = Integer.parseInt(dateDay);
            
            // 4. tempYear, tempMonth, tempDay 와 todayYear, todayMonth, todayDay 비교하기
            // 계약 파기 안됨
            if (tempYear == todayYear && tempMonth == todayMonth && tempDay > todayDay) {
                continue;
            }
            else if (tempYear == todayYear && tempMonth > todayMonth) {
                continue;
            } else if (tempYear > todayYear) {
                continue;
            }
            answer.add(i+1);
        }
        
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}