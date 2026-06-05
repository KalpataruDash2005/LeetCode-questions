class Solution {
    public List<List<Integer>> generate(int numRows) {
        List <List<Integer>> ans = new ArrayList <>();


        for(int i = 0 ; i < numRows ; i++){
            List <Integer> list1 = new ArrayList<>(); 
            
            for(int j = 0 ; j <= i ; j++){
                if(j==0 || j==i){
                    list1.add(1);
                } else {
                    List <Integer> list2 = ans.get(i-1);
                    int sum = list2.get(j-1) + list2.get(j);
                    list1.add(sum);
                }
            }
            ans.add(list1);
        }
       return ans; 
    }
}
