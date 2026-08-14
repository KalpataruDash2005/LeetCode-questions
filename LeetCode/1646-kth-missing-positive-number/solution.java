class Solution { 
    public int findKthPositive(int[] arr, int k) { 
        int[] arr1 = new int[arr.length + (k + 1)]; 
        
        for(int i = 0; i < arr1.length; i++){ 
            arr1[i] = i + 1; 
        } 
        
        int i = 0, count = 0; 
        int j = 0; 
        
        while(j < arr1.length){ 
            if(i < arr.length && arr[i] == arr1[j]){ 
                i++; 
                j++; 
            } else { 
                count++; 
                if(count == k){ 
                    return arr1[j]; 
                } 
                j++; 
            } 
        } 
        return 0; 
    } 
}

