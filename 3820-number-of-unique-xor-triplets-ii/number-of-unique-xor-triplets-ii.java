
class Solution {
    public int uniqueXorTriplets(int[] nums) {
        final int max = 2048;
        boolean[] dp0 = new boolean[max];
        boolean[] dp1 = new boolean[max];
        boolean[] dp2 = new boolean[max];
        boolean[] dp3 = new boolean[max];
        dp0[0] = true;
        for (int val : nums) {
            for (int x = 0; x < max; x++) {
                if (dp2[x])
                    dp3[x ^ val] = true;
            }
            for (int x = 0; x < max; x++) {
                if (dp1[x])
                    dp2[x ^ val] = true;
            }
            for (int x = 0; x < max; x++) {
                if (dp0[x])
                    dp1[x ^ val] = true;
            }
        }
        boolean[] seen = new boolean[max];
        for (int x = 0; x < max; x++) {
            if (dp1[x])
                seen[x] = true;
            if (dp3[x])
                seen[x] = true;
        }
        int res = 0;
        for (boolean b : seen) {
            if (b)
                res++;
        }
        return res;
    }
}