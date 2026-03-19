class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);

        int[] result = new int[spells.length];
        int n = spells.length;
        int m = potions.length;

        int i = 0;

        while (i < n) {
            int s = spells[i];

            long target = (success + s - 1) / s;

            int l = 0;
            int e = m - 1;
            int idx = m;

            while (l <= e) {
                int mid = (l + e) / 2;

                if (potions[mid] >= target) {
                    idx = mid;
                    e = mid - 1;
                } else {
                    l = mid + 1;
                }
            }

            result[i] = m - idx;
            i++;
        }

        return result;
    }
}