class Solution {
    public List<Long> maximumEvenSplit(long finalSum) {
        if (finalSum % 2 != 0) {
            return new ArrayList<>();
        }

        List<Long> result = new ArrayList<>();
        long currentEven = 2;

        
        while (finalSum - currentEven > currentEven) {
            result.add(currentEven);
            finalSum -= currentEven;
            currentEven += 2;
        }

        result.add(finalSum);

        return result;
    }
}

