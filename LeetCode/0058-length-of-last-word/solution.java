class Solution { 
    public int lengthOfLastWord(String s) { 
        String[] words = s.trim().split("\\s+"); 
        int lastWordIndex = words.length - 1;
        String lastWord = words[lastWordIndex]; 
        return lastWord.length(); 
    } 
}

