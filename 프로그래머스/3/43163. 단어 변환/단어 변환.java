import java.util.*;

class Solution {
    public int solution(String begin, String target, String[] words) {
        int answer = 0;
        List<String> list = Arrays.asList(words);
        
        // if words 배열에 target 이 있는 경우
        if (list.contains(target)) {
            Queue<CurrentWord> queue = new LinkedList<>();
            queue.add(new CurrentWord(begin, 0));
            
            while (!queue.isEmpty()) {
                CurrentWord currentWords = queue.poll();
                String currentWord = currentWords.word;
                int count = currentWords.count;
                
                if (currentWord.equals(target)) {
                    answer = count;
                    break;
                }
                
                // words 배열에서 queue 에 담긴 단어 중 한 글자만 바꿀 수 있는 경우 queue 에 저장
                for (int i=0;i<words.length;i++) {
                    if (words[i].equals(currentWord)) continue;
                    
                    for (int j=0;j<currentWord.length();j++){
                        if (j == 0) {
                            String end = currentWord.substring(j+1);
                            
                            if (words[i].endsWith(end)) {
                                queue.add(new CurrentWord(words[i], count+1));
                            }
                        } else if (j == currentWord.length() - 1) {
                            String start = currentWord.substring(0, j);
                            
                            if (words[i].startsWith(start)) {
                                queue.add(new CurrentWord(words[i], count+1));
                            }
                        } else {
                            String start = currentWord.substring(0, j);
                            String end = currentWord.substring(j+1);
                            
                            if (words[i].startsWith(start) && words[i].endsWith(end)) {
                                queue.add(new CurrentWord(words[i], count+1));
                            }
                        }
                    }
                }
            }
        }
        
        return answer;
    }
}

class CurrentWord {
    String word;
    int count;
    
    CurrentWord(String word, int count) {
        this.word = word;
        this.count = count;
    }
}