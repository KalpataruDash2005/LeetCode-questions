import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public long countNonDecreasingSubarrays(int[] nums, int k) {
        int n = nums.length;
        long ans = 0;
        long cost = 0;
        
        Deque<Integer> dq = new ArrayDeque<>();
        int right = n - 1;

        for (int left = n - 1; left >= 0; left--) {
            while (!dq.isEmpty() && nums[dq.peekLast()] < nums[left]) {
                int j = dq.pollLast();
                int nextBoundary = dq.isEmpty() ? right + 1 : dq.peekLast();
                cost += (long) (nextBoundary - j) * (nums[left] - nums[j]);
            }
            
            dq.offerLast(left);

            while (cost > k) {
                int maxIdx = dq.peekFirst();
                cost -= (long) (nums[maxIdx] - nums[right]);
                
                if (maxIdx == right) {
                    dq.pollFirst();
                }
                right--;
            }

            ans += (right - left + 1);
        }

        return ans;
    }
}
