class Solution {
    public String solution(String new_id) {
        String answer = "";
        
        // 1 단계
        new_id = new_id.toLowerCase();
        
        // 2단계
        new_id = new_id.replaceAll("[^a-z0-9-_.]", "");
        
        // 3단계
        new_id = new_id.replaceAll("[.]+", ".");
        
        // 4단계
        if (new_id.startsWith(".")) {
            new_id = new_id.substring(1);
        }
        if (new_id.endsWith(".")) {
            new_id = new_id.substring(0, new_id.length()-1);
        }
        
        // 5단계
        if (new_id.equals("")) new_id = "a";
        
        // 6단계
        if (new_id.length() >= 16) {
            new_id = new_id.substring(0,15);
            
            if (new_id.startsWith(".")) {
                new_id = new_id.substring(1);
            }
            if (new_id.endsWith(".")) {
                new_id = new_id.substring(0, new_id.length()-1);
            }
        }
        
        // 7단계
        if (new_id.length() <= 2) {
            int length = 3 - new_id.length();
            
            for (int i=0;i<length;i++) {
                new_id += new_id.charAt(new_id.length()-1);
            }
        }
        
        return new_id.toString();
    }
}