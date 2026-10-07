import java.util.*;

class Solution {
    public List<String> removeInvalidParentheses(String s) {
        List<String> result = new ArrayList<>();
        Queue<String> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>();

        queue.add(s);
        visited.add(s);

        boolean found = false;

        while (!queue.isEmpty()) {
            String curr = queue.poll();

            // If a valid string is found, record it
            if (isValid(curr)) {
                result.add(curr);
                found = true; 
            }

            // If we found valid strings at this level, don't generate deeper strings
            if (found) continue;

            // Try removing each parenthesis one by one
            for (int i = 0; i < curr.length(); i++) {
                if (curr.charAt(i) != '(' && curr.charAt(i) != ')') continue;

                String next = curr.substring(0, i) + curr.substring(i + 1);

                if (!visited.contains(next)) {
                    visited.add(next);
                    queue.add(next);
                }
            }
        }

        return result;
    }

    // Checks if parentheses are balanced
    private boolean isValid(String str) {
        int count = 0;
        for (char c : str.toCharArray()) {
            if (c == '(') count++;
            if (c == ')') count--;
            if (count < 0) return false; // Extra closing bracket
        }
        return count == 0;
    }
}