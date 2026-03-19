class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1;
        int r = 0;

        // find max pile (upper bound)
        for (int p : piles) {
            r = Math.max(r, p);
        }

        int ans = r;

        while (l <= r) {
            int mid = l + (r - l) / 2;

            long hours = 0;

            for (int p : piles) {
                hours += (p + mid - 1) / mid; // ceil
            }

            if (hours <= h) {
                ans = mid;
                r = mid - 1; // try smaller k
            } else {
                l = mid + 1; // need faster speed
            }
        }

        return ans;
    }
}
