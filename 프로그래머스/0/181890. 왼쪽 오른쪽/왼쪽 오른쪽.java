import java.util.*;

class Solution {
    public String[] solution(String[] str_list) {
        List<String> strList = new ArrayList<>();
        
        for (int i=0;i<str_list.length;i++) {
            if (str_list[i].equals("l")) {
                for (int j=0;j<i;j++) {
                    strList.add(str_list[j]);
                }
                break;
            } else if (str_list[i].equals("r")) {
                for (int j=i+1;j<str_list.length;j++) {
                    strList.add(str_list[j]);
                }
                break;
            }
        }
        
        return strList.toArray(String[]::new);
    }
}