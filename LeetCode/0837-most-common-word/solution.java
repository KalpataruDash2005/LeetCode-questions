import java.util.*;

class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        String cleanParagraph = paragraph.toLowerCase().replaceAll("[!?',;.]", " ");
        String[] arr = cleanParagraph.trim().split("\\s+");
        
        List<String> bannedList = Arrays.asList(banned);
        HashMap<String, Integer> map = new HashMap<>();
        
        for (String val : arr) {
            if (!val.isEmpty() && !bannedList.contains(val)) {
                map.put(val, map.getOrDefault(val, 0) + 1);
            }
        }
        
        String maxWord = "";
        int maxCount = 0;
        
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                maxWord = entry.getKey();
            }
        }
        
        return maxWord;
    }
}

