class Solution {
    public int calPoints(String[] operations) {
        List<Integer> record = new ArrayList<>();
        
        for (String op : operations) {
            int size = record.size();
            switch (op) {
                case "+":
                    record.add(record.get(size - 1) + record.get(size - 2));
                    break;
                case "D":
                    record.add(record.get(size - 1) * 2);
                    break;
                case "C":
                    record.remove(size - 1);
                    break;
                default:
                    record.add(Integer.parseInt(op));
                    break;
            }
        }
        
        int totalSum = 0;
        for (int score : record) {
            totalSum += score;
        }
        return totalSum;
    }
}
