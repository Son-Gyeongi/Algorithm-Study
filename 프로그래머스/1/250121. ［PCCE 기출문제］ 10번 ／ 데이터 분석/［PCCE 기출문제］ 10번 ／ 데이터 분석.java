import java.util.*;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        // 정렬한 데이터들이 담긴 이차원 정수 리스트 data
        // 어떤 정보를 기준으로 데이터를 뽑아낼지를 의미하는 문자열 ext - "code", "date", "maximum", "remain"
        // 뽑아낼 정보의 기준값을 나타내는 정수 val_ext
        // 정보를 정렬할 기준이 되는 문자열 sort_by
        
        // data에서 ext 값이 val_ext보다 작은 데이터만 뽑은 후, (ext 기준은 포함 안됨)
        // sort_by에 해당하는 값을 기준으로 오름차순으로 정렬하여 return
        
        // 1. 기준이 되는 컬럼 구하기
        int standard = 0;
        if (ext.equals("code")) standard = 0;
        else if (ext.equals("date")) standard = 1;
        else if (ext.equals("maximum")) standard = 2;
        else if (ext.equals("remain")) standard = 3;
        
        // 2. 기준에 맞는 작은 데이터들 배열에 넣기
        List<Integer> list = new ArrayList<>();
        for (int i=0;i<data.length;i++) {
            if (data[i][standard] < val_ext) {
                list.add(data[i][standard]);
            }            
        }
        
        // 3. 2번에서 찾은 키 값으로 data에 있는 값 거르기
        int[][] sortedData = new int[list.size()][4];
        for (int i=0;i<list.size();i++) {
            for (int j=0;j<data.length;j++) {
                if (list.get(i).equals(data[j][standard])) {
                    sortedData[i] = data[j];
                }
            }
        }
        
        // 4.  sort_by 값으로 오름차순 정렬하기
        int sort = 0;
        if (sort_by.equals("code")) sort = 0;
        else if (sort_by.equals("date")) sort = 1;
        else if (sort_by.equals("maximum")) sort = 2;
        else if (sort_by.equals("remain")) sort = 3;
        
        for (int i=0;i<sortedData.length-1;i++) {
            for (int j=i+1;j<sortedData.length;j++) {
                int first = sortedData[i][sort];
                int second = sortedData[j][sort];
                
                int min = Math.min(first, second);
                
                if (min == first) {
                    continue;
                } else {
                    int[][] temp = new int[1][4];
                    temp[0] = sortedData[i];
                    sortedData[i] = sortedData[j];
                    sortedData[j] = temp[0];
                }
            }
        }
        
        return sortedData;
    }
}