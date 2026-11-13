import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public long countNonDecreasingSubarrays(int[] nums, int k) {
        int n = nums.length;
        long ans = 0;
        long cost = 0;
        
        // Stores indices of elements in non-increasing order (front = largest)
        Deque<Integer> dq = new ArrayDeque<>();
        int right = n - 1;

        // Expand the sliding window from right to left
        for (int left = n - 1; left >= 0; left--) {
            // Merge smaller elements on the right into the new prefix maximum nums[left]
            while (!dq.isEmpty() && nums[dq.peekLast()] < nums[left]) {
                int j = dq.pollLast();
                int nextBoundary = dq.isEmpty() ? right + 1 : dq.peekLast();
                cost += (long) (nextBoundary - j) * (nums[left] - nums[j]);
            }
            
            dq.offerLast(left);

            // Shrink the window from the right if operations exceed k
            while (cost > k) {
                int maxIdx = dq.peekFirst();
                cost -= (long) (nums[maxIdx] - nums[right]);
                
                if (maxIdx == right) {
                    dq.pollFirst();
                }
                right--;
            }

            // All subarrays starting at 'left' and ending at [left..right] are valid
            ans += (right - left + 1);
        }

        return ans;
    }
}
