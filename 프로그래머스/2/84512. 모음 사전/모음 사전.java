import java.util.*;

class Solution {
    public int solution(String word) {
        // 그냥 막 조합하고 오름차순을 할까? TreeSet<>, PriorityQueue<>
        String[] alphabet = {"A","E","I","O","U"};
        Set<String> set = new TreeSet<>();
        
        for (int i=0;i<alphabet.length;i++) {
            String str1 = alphabet[i];
            set.add(str1);
            
            for (int j=0;j<alphabet.length;j++) {
                String str2 = str1 + alphabet[j];
                set.add(str2);
                
                for (int x=0;x<alphabet.length;x++) {
                    String str3 = str2 + alphabet[x];
                    set.add(str3);
                    
                    for (int y=0;y<alphabet.length;y++) {
                        String str4 = str3 + alphabet[y];
                        set.add(str4);
                        
                        for (int z=0;z<alphabet.length;z++) {
                            String str5 = str4 + alphabet[z];
                            set.add(str5);
                        }
                    }
                }
            }
        }
        
        int count = 0;
        for (String str : set) {
            count++;
            if (word.equals(str)) break;
        }
        
        return count;
    }
}