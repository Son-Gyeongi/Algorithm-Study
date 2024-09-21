import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = {};
        s = s.replace("{{", "");
        s = s.replace("}}", "");
        s = s.replace("}", "/");
        s = s.replace("{", "");
        String[] sArr = s.split("/,");
        
        // 각 튜플의 길이에 따라 정렬
        Arrays.sort(sArr, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.length() - s2.length();
            }
        });
        
        // for 문 돌면서 각 튜플 중에 List에 없는 값을 추가
        List<Integer> list = new ArrayList<>();
        for (int i=0;i<sArr.length;i++) {
            String[] tempStr = sArr[i].split(",");
            
            if (i == 0) {
                list.add(Integer.parseInt(tempStr[0]));
                continue;
            }
            
            for (int j=0;j<tempStr.length;j++) {
                if (!list.contains(Integer.parseInt(tempStr[j]))) {
                    list.add(Integer.parseInt(tempStr[j]));
                    break;
                }
            }
        }
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}