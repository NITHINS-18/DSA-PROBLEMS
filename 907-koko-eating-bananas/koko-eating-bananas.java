class Solution {
   int koko(int[] piles, int h, int k) {
        int hours = 0;
        for (int pile : piles) {
            hours += (pile + k - 1) / k; 
            if (hours > h) {
                return hours;
            }
        }
        return hours;
    }
    public int minEatingSpeed(int[] piles, int h) {
               int l = 1;
        int r = 0;

        // Maximum pile is the maximum possible speed
        for (int pile : piles) {
            r = Math.max(r, pile);
        }

        int ans = r;

        while (l <= r) {
            int m = l + (r - l) / 2;
            int hours = koko(piles, h, m);
            if (hours <= h) {
                ans = m;
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return ans;
    }
}