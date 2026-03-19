class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length;

        // check first element
        if (n == 1 || nums[0] > nums[1]) return 0;

        // check middle elements
        for (int i = 1; i < n - 1; i++) {
            if (nums[i] > nums[i - 1] && nums[i] > nums[i + 1]) {
                return i;
            }
        }

        // check last element
        return n - 1;
    }
}