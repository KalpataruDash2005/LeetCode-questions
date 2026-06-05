class Solution {
    public List<Integer> getRow(int rowIndex) {
        Integer [] arr = new Integer [rowIndex+1];
        Arrays.fill(arr,1);
        for(int i = 2; i < rowIndex+1 ; i++){
            for(int j = 1 ; j < i ; j++){
                arr[i-j] += arr[i-j-1];
            }
        }
        return Arrays.asList(arr);
    }
}
