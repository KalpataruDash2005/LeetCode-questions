class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        String []arr = new String[names.length];
        for(int i = 0 ; i< names.length - 1 ; i++){
            if(heights[i] < heights[i+1]){
                String temp = names[i];
                names[i] = names[i+1];
                names[i+1] = temp;
            }
        }
        return names;
    }
}